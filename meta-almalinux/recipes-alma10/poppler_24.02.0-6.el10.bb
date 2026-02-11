
PN = "poppler"
PE = "0"
PV = "24.02.0"
PR = "6.el10"
PACKAGES = "poppler poppler-cpp poppler-glib poppler-qt6 poppler-utils poppler-cpp-devel poppler-devel poppler-glib-devel poppler-glib-doc poppler-qt6-devel"


URI_poppler = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/poppler-24.02.0-6.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:poppler = "
 zlib-ng-compat
 nss
 freetype
 libpng
 lcms2
 openjpeg2
 libgcc
 gpgmepp
 fontconfig
 poppler-data
 libstdc++
 libcurl
 glibc
 libtiff
 libjpeg-turbo
 nspr
"

URI_poppler-cpp = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/poppler-cpp-24.02.0-6.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:poppler-cpp = "
 glibc
 libgcc
 libstdc++
 poppler
"

URI_poppler-glib = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/poppler-glib-24.02.0-6.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:poppler-glib = "
 freetype
 libgcc
 poppler
 libstdc++
 cairo
 glib2
 glibc
"

URI_poppler-qt6 = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/poppler-qt6-24.02.0-6.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:poppler-qt6 = "
 freetype
 lcms2
 libgcc
 qt6-qtbase
 poppler
 libstdc++
 qt6-qtbase-gui
 glibc
"

URI_poppler-utils = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/poppler-utils-24.02.0-6.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:poppler-utils = "
 freetype
 lcms2
 libgcc
 poppler
 libstdc++
 cairo
 glibc
"

URI_poppler-cpp-devel = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/poppler-cpp-devel-24.02.0-6.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:poppler-cpp-devel = "
 poppler-devel
 pkgconf-pkg-config
 poppler-cpp
"

URI_poppler-devel = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/poppler-devel-24.02.0-6.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:poppler-devel = "
 pkgconf-pkg-config
 poppler
"

URI_poppler-glib-devel = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/poppler-glib-devel-24.02.0-6.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:poppler-glib-devel = "
 glib2-devel
 pkgconf-pkg-config
 poppler-glib
 poppler-devel
 cairo-devel
"

URI_poppler-glib-doc = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/poppler-glib-doc-24.02.0-6.el10.noarch.rpm;unpack=0"
RDEPENDS:poppler-glib-doc = ""

URI_poppler-qt6-devel = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/poppler-qt6-devel-24.02.0-6.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:poppler-qt6-devel = "
 poppler-qt6
 poppler-devel
 pkgconf-pkg-config
 qt6-qtbase-devel
"
