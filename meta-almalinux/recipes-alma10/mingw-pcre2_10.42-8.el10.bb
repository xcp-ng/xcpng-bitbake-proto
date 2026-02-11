
PN = "mingw-pcre2"
PE = "0"
PV = "10.42"
PR = "8.el10"
PACKAGES = "mingw32-pcre2 mingw32-pcre2-static mingw64-pcre2 mingw64-pcre2-static"


URI_mingw32-pcre2 = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/mingw32-pcre2-10.42-8.el10.noarch.rpm;unpack=0"
RDEPENDS:mingw32-pcre2 = "/usr/bin/sh ( ) mingw32-crt ( ) mingw32(kernel32.dll) ( ) mingw32(msvcrt.dll) ( ) mingw32-pkg-config ( ) mingw32-filesystem ( >=  95)"
RPROVIDES:mingw32-pcre2 = "mingw32(libpcre2-8-0.dll) ( ) mingw32(libpcre2-16-0.dll) ( ) mingw32(libpcre2-32-0.dll) ( ) mingw32(libpcre2-posix-3.dll) ( ) mingw32-pkgconfig(libpcre2-16) ( ) mingw32-pkgconfig(libpcre2-32) ( ) mingw32-pkgconfig(libpcre2-8) ( ) mingw32-pkgconfig(libpcre2-posix) ( ) mingw32-pcre2 ( =  10.42-8.el10)"

URI_mingw32-pcre2-static = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/mingw32-pcre2-static-10.42-8.el10.noarch.rpm;unpack=0"
RDEPENDS:mingw32-pcre2-static = ""
RPROVIDES:mingw32-pcre2-static = "mingw32-pcre2-static ( =  10.42-8.el10)"

URI_mingw64-pcre2 = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/mingw64-pcre2-10.42-8.el10.noarch.rpm;unpack=0"
RDEPENDS:mingw64-pcre2 = "/usr/bin/sh ( ) mingw64-crt ( ) mingw64(kernel32.dll) ( ) mingw64(msvcrt.dll) ( ) mingw64-pkg-config ( ) mingw64-filesystem ( >=  95)"
RPROVIDES:mingw64-pcre2 = "mingw64(libpcre2-8-0.dll) ( ) mingw64(libpcre2-16-0.dll) ( ) mingw64(libpcre2-32-0.dll) ( ) mingw64(libpcre2-posix-3.dll) ( ) mingw64-pkgconfig(libpcre2-16) ( ) mingw64-pkgconfig(libpcre2-32) ( ) mingw64-pkgconfig(libpcre2-8) ( ) mingw64-pkgconfig(libpcre2-posix) ( ) mingw64-pcre2 ( =  10.42-8.el10)"

URI_mingw64-pcre2-static = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/mingw64-pcre2-static-10.42-8.el10.noarch.rpm;unpack=0"
RDEPENDS:mingw64-pcre2-static = ""
RPROVIDES:mingw64-pcre2-static = "mingw64-pcre2-static ( =  10.42-8.el10)"
