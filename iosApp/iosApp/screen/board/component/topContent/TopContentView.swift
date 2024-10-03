import SwiftUI

struct TopContentView: View {
    var body: some View {
        HStack {
            DifficultyView()
            Spacer()
            TimerView()
            Spacer()
            PauseButtonView()
        }
    }
}

#Preview {
    TopContentView()
}
