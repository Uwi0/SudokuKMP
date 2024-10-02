import SwiftUI

struct BoardScreenView: View {
    var body: some View {
        VStack {
            BoardGameView()
                .padding()
            Spacer()
            Text("Controller")
        }
    }
}

#Preview {
    BoardScreenView()
}
