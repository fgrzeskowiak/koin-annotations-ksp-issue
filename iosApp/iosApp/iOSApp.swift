import SwiftUI
import ComposeApp

@main
struct iOSApp: App {
    
    init() {
        KoinApp.shared.startKoin()
    }
    
    var body: some Scene {
        WindowGroup {
            ContentView()
        }
    }
}
