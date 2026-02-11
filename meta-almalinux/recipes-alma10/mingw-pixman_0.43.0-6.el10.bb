
PN = "mingw-pixman"
PE = "0"
PV = "0.43.0"
PR = "6.el10"
PACKAGES = "mingw32-pixman mingw64-pixman mingw32-pixman-static mingw64-pixman-static"


URI_mingw32-pixman = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/mingw32-pixman-0.43.0-6.el10.noarch.rpm;unpack=0"
RDEPENDS:mingw32-pixman = "mingw32-crt ( ) mingw32(kernel32.dll) ( ) mingw32(msvcrt.dll) ( ) mingw32-pkg-config ( ) mingw32(libgcc_s_dw2-1.dll) ( ) mingw32-filesystem ( >=  95)"
RPROVIDES:mingw32-pixman = "mingw32(libpixman-1-0.dll) ( ) mingw32-pkgconfig(pixman-1) ( ) mingw32-pixman ( =  0.43.0-6.el10)"

URI_mingw64-pixman = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/mingw64-pixman-0.43.0-6.el10.noarch.rpm;unpack=0"
RDEPENDS:mingw64-pixman = "mingw64-crt ( ) mingw64(kernel32.dll) ( ) mingw64(msvcrt.dll) ( ) mingw64-pkg-config ( ) mingw64(libgcc_s_seh-1.dll) ( ) mingw64-filesystem ( >=  95)"
RPROVIDES:mingw64-pixman = "mingw64(libpixman-1-0.dll) ( ) mingw64-pkgconfig(pixman-1) ( ) mingw64-pixman ( =  0.43.0-6.el10)"

URI_mingw32-pixman-static = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/mingw32-pixman-static-0.43.0-6.el10.noarch.rpm;unpack=0"
RDEPENDS:mingw32-pixman-static = "mingw32-pixman ( =  0.43.0-6.el10)"
RPROVIDES:mingw32-pixman-static = "mingw32-pixman-static ( =  0.43.0-6.el10)"

URI_mingw64-pixman-static = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/mingw64-pixman-static-0.43.0-6.el10.noarch.rpm;unpack=0"
RDEPENDS:mingw64-pixman-static = "mingw64-pixman ( =  0.43.0-6.el10)"
RPROVIDES:mingw64-pixman-static = "mingw64-pixman-static ( =  0.43.0-6.el10)"
