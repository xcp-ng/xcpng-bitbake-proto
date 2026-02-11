
PN = "mingw-gettext"
PE = "0"
PV = "0.22.5"
PR = "2.el10"
PACKAGES = "mingw32-gettext mingw32-gettext-static mingw64-gettext mingw64-gettext-static"


URI_mingw32-gettext = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/mingw32-gettext-0.22.5-2.el10.noarch.rpm;unpack=0"
RDEPENDS:mingw32-gettext = "/usr/bin/sh ( ) mingw32-crt ( ) mingw32(kernel32.dll) ( ) mingw32(msvcrt.dll) ( ) mingw32(libgcc_s_dw2-1.dll) ( ) mingw32(advapi32.dll) ( ) mingw32(ws2_32.dll) ( ) mingw32(bcrypt.dll) ( ) mingw32(iconv.dll) ( ) mingw32(libstdc++-6.dll) ( ) mingw32(libtermcap-0.dll) ( ) mingw32-filesystem ( >=  95)"
RPROVIDES:mingw32-gettext = "mingw32(libintl-8.dll) ( ) mingw32(libasprintf-0.dll) ( ) mingw32(libgettextlib-0-22-5.dll) ( ) mingw32(libgettextpo-0.dll) ( ) mingw32(libgettextsrc-0-22-5.dll) ( ) mingw32(libtextstyle-0.dll) ( ) mingw32-gettext ( =  0.22.5-2.el10)"

URI_mingw32-gettext-static = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/mingw32-gettext-static-0.22.5-2.el10.noarch.rpm;unpack=0"
RDEPENDS:mingw32-gettext-static = "mingw32-gettext ( =  0.22.5-2.el10)"
RPROVIDES:mingw32-gettext-static = "mingw32-gettext-static ( =  0.22.5-2.el10)"

URI_mingw64-gettext = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/mingw64-gettext-0.22.5-2.el10.noarch.rpm;unpack=0"
RDEPENDS:mingw64-gettext = "/usr/bin/sh ( ) mingw64-crt ( ) mingw64(kernel32.dll) ( ) mingw64(msvcrt.dll) ( ) mingw64(advapi32.dll) ( ) mingw64(ws2_32.dll) ( ) mingw64(bcrypt.dll) ( ) mingw64(iconv.dll) ( ) mingw64(libstdc++-6.dll) ( ) mingw64(libtermcap-0.dll) ( ) mingw64-filesystem ( >=  95)"
RPROVIDES:mingw64-gettext = "mingw64(libintl-8.dll) ( ) mingw64(libasprintf-0.dll) ( ) mingw64(libgettextlib-0-22-5.dll) ( ) mingw64(libgettextpo-0.dll) ( ) mingw64(libgettextsrc-0-22-5.dll) ( ) mingw64(libtextstyle-0.dll) ( ) mingw64-gettext ( =  0.22.5-2.el10)"

URI_mingw64-gettext-static = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/mingw64-gettext-static-0.22.5-2.el10.noarch.rpm;unpack=0"
RDEPENDS:mingw64-gettext-static = "mingw64-gettext ( =  0.22.5-2.el10)"
RPROVIDES:mingw64-gettext-static = "mingw64-gettext-static ( =  0.22.5-2.el10)"
