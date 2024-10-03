import SwiftUI

struct PauseButtonView: View {
    private let size: CGFloat = 16
    var body: some View {
        Button(
            action: {},
            label: {
                Image(systemName: "pause.fill")
                    .resizable()
                    .foregroundStyle(.gray)
                    .frame(width: size, height: size)
                    .padding()
                    .background(.gray.opacity(0.5))
                    .clipShape(Circle())
            }
        )
    }
}

#Preview {
    PauseButtonView()
}
