import SwiftUI

struct KeyboardItemView: View {
    let number: Int
    let remainingUse: Int?
    
    var body: some View {
        let hasRemainingUse = remainingUse != nil
        
        VStack {
            Text(String(format: "%X", number))
                .font(.title)
            
            if hasRemainingUse {
                Text("\(remainingUse!)")
                    .font(.body)
            }
        }
        .padding(7)
        .frame(maxWidth: .infinity)
    }
}

#Preview {
    KeyboardItemView(number: 7, remainingUse: 8)
}
