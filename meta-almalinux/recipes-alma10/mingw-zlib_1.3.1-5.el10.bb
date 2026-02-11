
PN = "mingw-zlib"
PE = "0"
PV = "1.3.1"
PR = "5.el10"
PACKAGES = "mingw32-zlib mingw32-zlib-static mingw64-zlib mingw64-zlib-static ucrt64-zlib ucrt64-zlib-static"


URI_mingw32-zlib = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/mingw32-zlib-1.3.1-5.el10.noarch.rpm;unpack=0"
RDEPENDS:mingw32-zlib = "mingw32-crt ( ) mingw32(kernel32.dll) ( ) mingw32(msvcrt.dll) ( ) mingw32-pkg-config ( ) mingw32-filesystem ( >=  95)"
RPROVIDES:mingw32-zlib = "mingw32(zlib1.dll) ( ) mingw32-pkgconfig(zlib) ( ) mingw32-zlib ( =  1.3.1-5.el10)"

URI_mingw32-zlib-static = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/mingw32-zlib-static-1.3.1-5.el10.noarch.rpm;unpack=0"
RDEPENDS:mingw32-zlib-static = "mingw32-zlib ( =  1.3.1-5.el10)"
RPROVIDES:mingw32-zlib-static = "mingw32-zlib-static ( =  1.3.1-5.el10)"

URI_mingw64-zlib = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/mingw64-zlib-1.3.1-5.el10.noarch.rpm;unpack=0"
RDEPENDS:mingw64-zlib = "mingw64-crt ( ) mingw64(kernel32.dll) ( ) mingw64(msvcrt.dll) ( ) mingw64-pkg-config ( ) mingw64-filesystem ( >=  95)"
RPROVIDES:mingw64-zlib = "mingw64(zlib1.dll) ( ) mingw64-pkgconfig(zlib) ( ) mingw64-zlib ( =  1.3.1-5.el10)"

URI_mingw64-zlib-static = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/mingw64-zlib-static-1.3.1-5.el10.noarch.rpm;unpack=0"
RDEPENDS:mingw64-zlib-static = "mingw64-zlib ( =  1.3.1-5.el10)"
RPROVIDES:mingw64-zlib-static = "mingw64-zlib-static ( =  1.3.1-5.el10)"

URI_ucrt64-zlib = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/ucrt64-zlib-1.3.1-5.el10.noarch.rpm;unpack=0"
RDEPENDS:ucrt64-zlib = "ucrt64-crt ( ) ucrt64(api-ms-win-crt-environment-l1-1-0.dll) ( ) ucrt64(api-ms-win-crt-heap-l1-1-0.dll) ( ) ucrt64(api-ms-win-crt-private-l1-1-0.dll) ( ) ucrt64(api-ms-win-crt-runtime-l1-1-0.dll) ( ) ucrt64(api-ms-win-crt-stdio-l1-1-0.dll) ( ) ucrt64(api-ms-win-crt-string-l1-1-0.dll) ( ) ucrt64(api-ms-win-crt-time-l1-1-0.dll) ( ) ucrt64(kernel32.dll) ( ) ucrt64(api-ms-win-crt-convert-l1-1-0.dll) ( ) ucrt64-pkg-config ( ) ucrt64-filesystem ( >=  95)"
RPROVIDES:ucrt64-zlib = "ucrt64(zlib1.dll) ( ) ucrt64-pkgconfig(zlib) ( ) ucrt64-zlib ( =  1.3.1-5.el10)"

URI_ucrt64-zlib-static = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/ucrt64-zlib-static-1.3.1-5.el10.noarch.rpm;unpack=0"
RDEPENDS:ucrt64-zlib-static = "ucrt64-zlib ( =  1.3.1-5.el10)"
RPROVIDES:ucrt64-zlib-static = "ucrt64-zlib-static ( =  1.3.1-5.el10)"
