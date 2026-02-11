
PN = "giflib"
PE = "0"
PV = "5.2.1"
PR = "22.el10"
PACKAGES = "giflib giflib-devel giflib-utils mingw32-giflib mingw32-giflib-tools mingw64-giflib mingw64-giflib-tools"


URI_giflib = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/giflib-5.2.1-22.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:giflib = "rtld(GNU_HASH) ( ) libc.so.6(GLIBC_2.14)(64bit) ( )"
RPROVIDES:giflib = "libgif.so.7()(64bit) ( ) giflib ( =  5.2.1-22.el10) giflib(x86-64) ( =  5.2.1-22.el10)"

URI_giflib-devel = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/giflib-devel-5.2.1-22.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:giflib-devel = "libgif.so.7()(64bit) ( ) giflib(x86-64) ( =  5.2.1-22.el10)"
RPROVIDES:giflib-devel = "giflib-devel ( =  5.2.1-22.el10) giflib-devel(x86-64) ( =  5.2.1-22.el10)"

URI_giflib-utils = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/giflib-utils-5.2.1-22.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:giflib-utils = "rtld(GNU_HASH) ( ) libc.so.6(GLIBC_2.34)(64bit) ( ) libm.so.6()(64bit) ( ) libm.so.6(GLIBC_2.29)(64bit) ( ) libgif.so.7()(64bit) ( ) giflib(x86-64) ( =  5.2.1-22.el10)"
RPROVIDES:giflib-utils = "giflib-utils ( =  5.2.1-22.el10) giflib-utils(x86-64) ( =  5.2.1-22.el10)"

URI_mingw32-giflib = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/mingw32-giflib-5.2.1-22.el10.noarch.rpm;unpack=0"
RDEPENDS:mingw32-giflib = "mingw32(kernel32.dll) ( ) mingw32(msvcrt.dll) ( ) mingw32-crt ( ) mingw32(libgcc_s_dw2-1.dll) ( ) mingw32-filesystem ( >=  95)"
RPROVIDES:mingw32-giflib = "mingw32(libgif-7.dll) ( ) mingw32-giflib ( =  5.2.1-22.el10)"

URI_mingw32-giflib-tools = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/mingw32-giflib-tools-5.2.1-22.el10.noarch.rpm;unpack=0"
RDEPENDS:mingw32-giflib-tools = "mingw32(kernel32.dll) ( ) mingw32(msvcrt.dll) ( ) mingw32-crt ( ) mingw32(libgif-7.dll) ( ) mingw32-filesystem ( >=  95) mingw32-giflib ( =  5.2.1-22.el10)"
RPROVIDES:mingw32-giflib-tools = "mingw32-giflib-tools ( =  5.2.1-22.el10)"

URI_mingw64-giflib = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/mingw64-giflib-5.2.1-22.el10.noarch.rpm;unpack=0"
RDEPENDS:mingw64-giflib = "mingw64(kernel32.dll) ( ) mingw64(msvcrt.dll) ( ) mingw64-crt ( ) mingw64-filesystem ( >=  95)"
RPROVIDES:mingw64-giflib = "mingw64(libgif-7.dll) ( ) mingw64-giflib ( =  5.2.1-22.el10)"

URI_mingw64-giflib-tools = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/mingw64-giflib-tools-5.2.1-22.el10.noarch.rpm;unpack=0"
RDEPENDS:mingw64-giflib-tools = "mingw64(kernel32.dll) ( ) mingw64(msvcrt.dll) ( ) mingw64-crt ( ) mingw64(libgif-7.dll) ( ) mingw64-filesystem ( >=  95) mingw64-giflib ( =  5.2.1-22.el10)"
RPROVIDES:mingw64-giflib-tools = "mingw64-giflib-tools ( =  5.2.1-22.el10)"
