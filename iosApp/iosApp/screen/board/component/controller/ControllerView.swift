import SwiftUI

struct ControllerView: View {
    var body: some View {
        VStack(spacing: 16) {
            ActionRowView()
            GameKeyboardView()
        }
    }
}

#Preview {
    ControllerView()
}
