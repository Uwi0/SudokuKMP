import SwiftUI

struct BoardScreenView: View {
    var body: some View {
        NavigationView {
            VStack(spacing: 24) {
                TopContentView()
                BoardGameView()
                Spacer()
                ControllerView()
            }
            .padding()
            .navigationBarTitleDisplayMode(.inline)
            .toolbar {
                ToolbarItem(placement: .topBarLeading) {
                    Button(action: {}) {
                        Image(systemName: "arrow.left")
                            .foregroundStyle(onSurface)
                    }
                }
                ToolbarItem(placement: .topBarTrailing){
                    Button(action: {}) {
                        Image(systemName: "gearshape")
                            .foregroundStyle(onSurface)
                    }
                }
            }
        }
    }
}

#Preview {
    BoardScreenView()
}
