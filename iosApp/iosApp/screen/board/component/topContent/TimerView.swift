import SwiftUI

struct TimerView: View {
    var body: some View {
        VStack(alignment: .center, spacing: 4) {
            Text("Timer")
                .font(.headline)
            Text("00:00")
        }
        
    }
}

#Preview {
    TimerView()
}
