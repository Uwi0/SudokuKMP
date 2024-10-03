import SwiftUI
import Shared

struct ActionButtonView: View {
    let action: GameAction
    let onClick: () -> Void
    
    private var resource: (image: String, text: String) { action.asResource() }
    
    var body: some View {
        Button(
            action: onClick, label: {
                VStack(spacing: 4) {
                    Image(systemName: resource.image)
                        .fontWeight(.bold)
                    Text(resource.text)
                }
                .font(.subheadline)
                .padding()
                .frame(maxWidth: .infinity)
                .background(.blue)
                .foregroundColor(.white)
                .cornerRadius(10)
            }
        )
    }
}

extension GameAction {
    func asResource() -> (String, String) {
        switch self {
            case .erase: return ("eraser.line.dashed", "Erase")
            case .hint: return ("lightbulb.max", "Hint")
            case .note: return ("pencil.line", "Note")
            case .undo: return ("arrow.uturn.backward", "Undo")
            default: return ("", "")
        }
    }
}

#Preview {
    ActionButtonView(action: GameAction.erase, onClick: {})
}
