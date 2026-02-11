
PN = "mingw-termcap"
PE = "0"
PV = "1.3.1"
PR = "39.el10"
PACKAGES = "mingw32-termcap mingw64-termcap mingw32-termcap-static mingw64-termcap-static"


URI_mingw32-termcap = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/mingw32-termcap-1.3.1-39.el10.noarch.rpm;unpack=0"
RDEPENDS:mingw32-termcap = "mingw32-crt ( ) mingw32(kernel32.dll) ( ) mingw32(msvcrt.dll) ( ) mingw32-filesystem ( >=  95)"
RPROVIDES:mingw32-termcap = "mingw32(libtermcap-0.dll) ( ) mingw32-termcap ( =  1.3.1-39.el10)"

URI_mingw64-termcap = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/mingw64-termcap-1.3.1-39.el10.noarch.rpm;unpack=0"
RDEPENDS:mingw64-termcap = "mingw64-crt ( ) mingw64(kernel32.dll) ( ) mingw64(msvcrt.dll) ( ) mingw64-filesystem ( >=  95)"
RPROVIDES:mingw64-termcap = "mingw64(libtermcap-0.dll) ( ) mingw64-termcap ( =  1.3.1-39.el10)"

URI_mingw32-termcap-static = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/mingw32-termcap-static-1.3.1-39.el10.noarch.rpm;unpack=0"
RDEPENDS:mingw32-termcap-static = "mingw32-termcap ( =  1.3.1-39.el10)"
RPROVIDES:mingw32-termcap-static = "mingw32-termcap-static ( =  1.3.1-39.el10)"

URI_mingw64-termcap-static = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/mingw64-termcap-static-1.3.1-39.el10.noarch.rpm;unpack=0"
RDEPENDS:mingw64-termcap-static = "mingw64-termcap ( =  1.3.1-39.el10)"
RPROVIDES:mingw64-termcap-static = "mingw64-termcap-static ( =  1.3.1-39.el10)"
