
PN = "mingw-win-iconv"
PE = "0"
PV = "0.0.8"
PR = "15.el10"
PACKAGES = "mingw32-win-iconv mingw32-win-iconv-static mingw64-win-iconv mingw64-win-iconv-static"


URI_mingw32-win-iconv = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/mingw32-win-iconv-0.0.8-15.el10.noarch.rpm;unpack=0"
RDEPENDS:mingw32-win-iconv = "mingw32-crt ( ) mingw32(kernel32.dll) ( ) mingw32(msvcrt.dll) ( ) mingw32-filesystem ( >=  95)"
RPROVIDES:mingw32-win-iconv = "mingw32(iconv.dll) ( ) mingw32-win-iconv ( =  0.0.8-15.el10) mingw32-iconv ( =  1.12-14)"

URI_mingw32-win-iconv-static = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/mingw32-win-iconv-static-0.0.8-15.el10.noarch.rpm;unpack=0"
RDEPENDS:mingw32-win-iconv-static = "mingw32-win-iconv ( =  0.0.8-15.el10)"
RPROVIDES:mingw32-win-iconv-static = "mingw32-iconv-static ( =  1.12-14) mingw32-win-iconv-static ( =  0.0.8-15.el10)"

URI_mingw64-win-iconv = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/mingw64-win-iconv-0.0.8-15.el10.noarch.rpm;unpack=0"
RDEPENDS:mingw64-win-iconv = "mingw64-crt ( ) mingw64(kernel32.dll) ( ) mingw64(msvcrt.dll) ( ) mingw64-filesystem ( >=  95)"
RPROVIDES:mingw64-win-iconv = "mingw64(iconv.dll) ( ) mingw64-win-iconv ( =  0.0.8-15.el10) mingw64-iconv ( =  1.13.1-2.el10)"

URI_mingw64-win-iconv-static = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/mingw64-win-iconv-static-0.0.8-15.el10.noarch.rpm;unpack=0"
RDEPENDS:mingw64-win-iconv-static = "mingw64-win-iconv ( =  0.0.8-15.el10)"
RPROVIDES:mingw64-win-iconv-static = "mingw64-iconv-static ( =  1.13.1-2.el10) mingw64-win-iconv-static ( =  0.0.8-15.el10)"
