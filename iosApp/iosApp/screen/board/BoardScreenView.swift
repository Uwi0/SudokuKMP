import SwiftUI

struct BoardScreenView: View {
    var body: some View {
        VStack {
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
