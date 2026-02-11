
PN = "mingw-libffi"
PE = "0"
PV = "3.4.6"
PR = "2.el10"
PACKAGES = "mingw32-libffi mingw64-libffi mingw32-libffi-static mingw64-libffi-static"


URI_mingw32-libffi = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/mingw32-libffi-3.4.6-2.el10.noarch.rpm;unpack=0"
RDEPENDS:mingw32-libffi = "mingw32-crt ( ) mingw32(kernel32.dll) ( ) mingw32(msvcrt.dll) ( ) mingw32-pkg-config ( ) mingw32-filesystem ( >=  95)"
RPROVIDES:mingw32-libffi = "mingw32(libffi-8.dll) ( ) mingw32-pkgconfig(libffi) ( ) mingw32-libffi ( =  3.4.6-2.el10)"

URI_mingw64-libffi = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/mingw64-libffi-3.4.6-2.el10.noarch.rpm;unpack=0"
RDEPENDS:mingw64-libffi = "mingw64-crt ( ) mingw64(kernel32.dll) ( ) mingw64(msvcrt.dll) ( ) mingw64-pkg-config ( ) mingw64-filesystem ( >=  95)"
RPROVIDES:mingw64-libffi = "mingw64(libffi-8.dll) ( ) mingw64-pkgconfig(libffi) ( ) mingw64-libffi ( =  3.4.6-2.el10)"

URI_mingw32-libffi-static = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/mingw32-libffi-static-3.4.6-2.el10.noarch.rpm;unpack=0"
RDEPENDS:mingw32-libffi-static = ""
RPROVIDES:mingw32-libffi-static = "mingw32-libffi-static ( =  3.4.6-2.el10)"

URI_mingw64-libffi-static = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/mingw64-libffi-static-3.4.6-2.el10.noarch.rpm;unpack=0"
RDEPENDS:mingw64-libffi-static = ""
RPROVIDES:mingw64-libffi-static = "mingw64-libffi-static ( =  3.4.6-2.el10)"
