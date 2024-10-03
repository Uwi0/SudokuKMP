import SwiftUI
import Shared

struct ActionRowView: View {
    var body: some View {
        HStack(spacing: 16) {
            ForEach(GameAction.entries, id: \.self) { action in
                ActionButtonView(action: action, onClick: {})
            }
        }
        .padding(16)
    }
}

#Preview {
    ActionRowView()
}
