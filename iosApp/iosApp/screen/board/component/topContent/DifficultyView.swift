import SwiftUI

struct DifficultyView: View {
    var body: some View {
        VStack(alignment: .leading, spacing: 4) {
            Text("Difficulty")
                .font(.headline)
            Text("Easy")
                .font(.subheadline)
        }
    }
}

#Preview {
    DifficultyView()
}
