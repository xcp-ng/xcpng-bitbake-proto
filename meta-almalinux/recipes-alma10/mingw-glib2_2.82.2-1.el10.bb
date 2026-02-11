
PN = "mingw-glib2"
PE = "0"
PV = "2.82.2"
PR = "1.el10"
PACKAGES = "mingw32-glib2 mingw32-glib2-static mingw64-glib2 mingw64-glib2-static"


URI_mingw32-glib2 = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/mingw32-glib2-2.82.2-1.el10.noarch.rpm;unpack=0"
RDEPENDS:mingw32-glib2 = "/usr/bin/sh ( ) /usr/bin/python3 ( ) mingw32-crt ( ) mingw32(kernel32.dll) ( ) mingw32(msvcrt.dll) ( ) python3 ( ) mingw32-pkg-config ( ) mingw32(libgcc_s_dw2-1.dll) ( ) mingw32(advapi32.dll) ( ) mingw32(ws2_32.dll) ( ) mingw32(dnsapi.dll) ( ) mingw32(iphlpapi.dll) ( ) mingw32(libffi-8.dll) ( ) mingw32(libintl-8.dll) ( ) mingw32(libpcre2-8-0.dll) ( ) mingw32(ole32.dll) ( ) mingw32(shell32.dll) ( ) mingw32(shlwapi.dll) ( ) mingw32(user32.dll) ( ) mingw32(zlib1.dll) ( ) mingw32-filesystem ( >=  95)"
RPROVIDES:mingw32-glib2 = "mingw32(libgio-2.0-0.dll) ( ) mingw32(libgirepository-2.0-0.dll) ( ) mingw32(libglib-2.0-0.dll) ( ) mingw32(libgmodule-2.0-0.dll) ( ) mingw32(libgobject-2.0-0.dll) ( ) mingw32(libgthread-2.0-0.dll) ( ) mingw32-pkgconfig(gio-2.0) ( ) mingw32-pkgconfig(gio-windows-2.0) ( ) mingw32-pkgconfig(girepository-2.0) ( ) mingw32-pkgconfig(glib-2.0) ( ) mingw32-pkgconfig(gmodule-2.0) ( ) mingw32-pkgconfig(gmodule-export-2.0) ( ) mingw32-pkgconfig(gmodule-no-export-2.0) ( ) mingw32-pkgconfig(gobject-2.0) ( ) mingw32-pkgconfig(gthread-2.0) ( ) mingw32-glib2 ( =  2.82.2-1.el10)"

URI_mingw32-glib2-static = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/mingw32-glib2-static-2.82.2-1.el10.noarch.rpm;unpack=0"
RDEPENDS:mingw32-glib2-static = "mingw32-gettext-static ( ) mingw32-glib2 ( =  2.82.2-1.el10)"
RPROVIDES:mingw32-glib2-static = "mingw32-glib2-static ( =  2.82.2-1.el10)"

URI_mingw64-glib2 = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/mingw64-glib2-2.82.2-1.el10.noarch.rpm;unpack=0"
RDEPENDS:mingw64-glib2 = "/usr/bin/sh ( ) /usr/bin/python3 ( ) mingw64-crt ( ) mingw64(kernel32.dll) ( ) mingw64(msvcrt.dll) ( ) python3 ( ) mingw64-pkg-config ( ) mingw64(advapi32.dll) ( ) mingw64(libgcc_s_seh-1.dll) ( ) mingw64(ws2_32.dll) ( ) mingw64(dnsapi.dll) ( ) mingw64(iphlpapi.dll) ( ) mingw64(libffi-8.dll) ( ) mingw64(libintl-8.dll) ( ) mingw64(libpcre2-8-0.dll) ( ) mingw64(ole32.dll) ( ) mingw64(shell32.dll) ( ) mingw64(shlwapi.dll) ( ) mingw64(user32.dll) ( ) mingw64(zlib1.dll) ( ) mingw64-filesystem ( >=  95)"
RPROVIDES:mingw64-glib2 = "mingw64(libgio-2.0-0.dll) ( ) mingw64(libgirepository-2.0-0.dll) ( ) mingw64(libglib-2.0-0.dll) ( ) mingw64(libgmodule-2.0-0.dll) ( ) mingw64(libgobject-2.0-0.dll) ( ) mingw64(libgthread-2.0-0.dll) ( ) mingw64-pkgconfig(gio-2.0) ( ) mingw64-pkgconfig(gio-windows-2.0) ( ) mingw64-pkgconfig(girepository-2.0) ( ) mingw64-pkgconfig(glib-2.0) ( ) mingw64-pkgconfig(gmodule-2.0) ( ) mingw64-pkgconfig(gmodule-export-2.0) ( ) mingw64-pkgconfig(gmodule-no-export-2.0) ( ) mingw64-pkgconfig(gobject-2.0) ( ) mingw64-pkgconfig(gthread-2.0) ( ) mingw64-glib2 ( =  2.82.2-1.el10)"

URI_mingw64-glib2-static = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/mingw64-glib2-static-2.82.2-1.el10.noarch.rpm;unpack=0"
RDEPENDS:mingw64-glib2-static = "mingw64-gettext-static ( ) mingw64-glib2 ( =  2.82.2-1.el10)"
RPROVIDES:mingw64-glib2-static = "mingw64-glib2-static ( =  2.82.2-1.el10)"
