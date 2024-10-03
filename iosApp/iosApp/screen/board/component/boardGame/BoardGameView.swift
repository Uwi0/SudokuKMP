import SwiftUI

struct BoardGameView: View {
    let boardSize: Int = 9
    let horThic: Int = 3
    let verThic: Int = 3
    
    private let cornerRadius: CGFloat = 5
    
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
            }
            .aspectRatio(1, contentMode: .fill)
            .clipShape(RoundedRectangle(cornerRadius: cornerRadius))
            .overlay(RoundedRectangle(cornerRadius: cornerRadius).stroke(Color.blue, lineWidth: 3))
            .frame(width: maxWidth, height: maxWidth)
        }
    }
}

#Preview {
    BoardGameView()
}
