
PN = "mingw-glib2"
PE = "0"
PV = "2.82.2"
PR = "1.el10"
PACKAGES = "mingw32-glib2 mingw32-glib2-static mingw64-glib2 mingw64-glib2-static"


URI_mingw32-glib2 = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/mingw32-glib2-2.82.2-1.el10.noarch.rpm;unpack=0"
RDEPENDS:mingw32-glib2 = " \
 python3 \
 mingw32-pcre2 \
 mingw32-zlib \
 bash \
 mingw32-crt \
 mingw32-filesystem \
 mingw32-gettext \
 mingw32-libffi \
 mingw32-libgcc \
"

URI_mingw32-glib2-static = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/mingw32-glib2-static-2.82.2-1.el10.noarch.rpm;unpack=0"
RDEPENDS:mingw32-glib2-static = " \
 mingw32-gettext-static \
 mingw32-glib2 \
"

URI_mingw64-glib2 = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/mingw64-glib2-2.82.2-1.el10.noarch.rpm;unpack=0"
RDEPENDS:mingw64-glib2 = " \
 python3 \
 mingw64-zlib \
 mingw64-crt \
 mingw64-filesystem \
 mingw64-gettext \
 bash \
 mingw64-libffi \
 mingw64-libgcc \
 mingw64-pcre2 \
"

URI_mingw64-glib2-static = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/mingw64-glib2-static-2.82.2-1.el10.noarch.rpm;unpack=0"
RDEPENDS:mingw64-glib2-static = " \
 mingw64-gettext-static \
 mingw64-glib2 \
"
