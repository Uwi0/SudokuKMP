import SwiftUI

struct BoardGameView: View {
    let boardSize: Int = 9
    let horThic: Int = 3
    let verThic: Int = 3
    
    var body: some View {
        GeometryReader { geometry in
            let maxWidth = geometry.size.width
            let cellSize = maxWidth / CGFloat(boardSize)
            
            Canvas { context, size  in
                
                for i in 1..<boardSize {
                    let isThickLine = i % horThic == 0
                    let lineColor = isThickLine ? Color.blue : Color.red
                    let lineWidth: CGFloat = isThickLine ? 2 : 1
                    
                    context.stroke(
                        Path { path in
                            path.move(to: CGPoint(x: cellSize * CGFloat(i), y: 0))
                            path.addLine(to: CGPoint(x: cellSize * CGFloat(i), y: maxWidth))
                        },
                        with: .color(lineColor),
                        lineWidth: lineWidth
                    )
                    
                }
                for i in 1..<boardSize {
                    let isThickLine = i % horThic == 0
                    let lineColor = isThickLine ? Color.blue : Color.red
                    let lineWidth: CGFloat = isThickLine ? 2 : 1
                    
                    context.stroke(
                        Path { path in
                            path.move(to: CGPoint(x: 0, y: cellSize * CGFloat(i)))
                            path.addLine(to: CGPoint(x: maxWidth, y: cellSize * CGFloat(i)))
                        },
                        with: .color(lineColor),
                        lineWidth: lineWidth
                    )
                }
                
                let rect = CGRect(x: 0, y: 0, width: maxWidth, height: maxWidth)
                let cornerRadius: CGFloat = 15.0
                let roundedRectPath = Path(roundedRect: rect, cornerRadius: cornerRadius)
                                
                context.stroke(roundedRectPath, with: .color(Color.blue), lineWidth: 2)
            }
            .aspectRatio(1, contentMode: .fill)
        }
    }
}

#Preview {
    BoardGameView().padding()
}
