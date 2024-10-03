import SwiftUI

struct BoardScreenView: View {
    var body: some View {
        VStack(spacing: 24) {
            TopContentView()
            BoardGameView()
            Spacer()
            ControllerView()
        }
        .padding()
    }
}

#Preview {
    BoardScreenView()
}
