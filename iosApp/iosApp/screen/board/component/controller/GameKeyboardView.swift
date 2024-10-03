import SwiftUI

struct GameKeyboardView: View {
    
    let numbers: [Int] = [1, 2, 3, 4, 5, 6, 7, 8, 9]
    
    var body: some View {
        HStack {
            ForEach(numbers, id: \.self) { number in
                KeyboardItemView(number: number, remainingUse: nil)
            }
        }
    }
}

#Preview {
    GameKeyboardView()
}
