
PN = "qt6-qtbase"
PE = "0"
PV = "6.8.1"
PR = "9.el10_0"
PACKAGES = "qt6-qtbase qt6-qtbase-common qt6-qtbase-devel qt6-qtbase-gui qt6-qtbase-mysql qt6-qtbase-odbc qt6-qtbase-postgresql qt6-qtbase-examples qt6-qtbase-private-devel qt6-qtbase-static qt6-qtbase-tests"


URI_qt6-qtbase = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/qt6-qtbase-6.8.1-9.el10_0.x86_64_v2.rpm;unpack=0"
RDEPENDS:qt6-qtbase = "
 zlib-ng-compat
 systemd-libs
 qt6-filesystem
 libproxy
 libgcc
 openssl-libs
 libbrotli
 libzstd
 sqlite-libs
 krb5-libs
 libstdc++
 pcre2-utf16
 glib2
 qt6-qtbase-common
 glibc
 libicu
 dbus-libs
"

URI_qt6-qtbase-common = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/qt6-qtbase-common-6.8.1-9.el10_0.noarch.rpm;unpack=0"
RDEPENDS:qt6-qtbase-common = "
 qt6-qtbase
"

URI_qt6-qtbase-devel = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/qt6-qtbase-devel-6.8.1-9.el10_0.x86_64_v2.rpm;unpack=0"
RDEPENDS:qt6-qtbase-devel = "
 cmake-filesystem
 libglvnd-devel
 libgcc
 qt6-qtbase-odbc
 pkgconf-pkg-config
 qt6-qtbase
 libzstd
 qt6-qtbase-devel
 libstdc++
 bash
 qt6-qtbase-gui
 pcre2-utf16
 qt6-rpm-macros
 glibc
 qt6-qtbase-mysql
 libxkbcommon-devel
 vulkan-loader-devel
 qt6-qtbase-postgresql
"

URI_qt6-qtbase-gui = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/qt6-qtbase-gui-6.8.1-9.el10_0.x86_64_v2.rpm;unpack=0"
RDEPENDS:qt6-qtbase-gui = "
 xcb-util-wm
 systemd-libs
 libpng
 mtdev
 cups-libs
 libICE
 fontconfig
 libSM
 libX11
 libX11-xcb
 glx-utils
 libdrm
 libstdc++
 zlib-ng-compat
 libglvnd-egl
 libglvnd-glx
 libglvnd-opengl
 libgcc
 libxcb
 bash
 mesa-libgbm
 libxkbcommon
 libxkbcommon-x11
 freetype
 xcb-util-image
 harfbuzz
 qt6-qtbase
 libinput
 glib2
 glibc
 xcb-util-cursor
 libjpeg-turbo
 xcb-util-keysyms
 xcb-util-renderutil
"

URI_qt6-qtbase-mysql = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/qt6-qtbase-mysql-6.8.1-9.el10_0.x86_64_v2.rpm;unpack=0"
RDEPENDS:qt6-qtbase-mysql = "
 cmake-filesystem
 qt6-qtbase
 libstdc++
 mariadb-connector-c
 glibc
"

URI_qt6-qtbase-odbc = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/qt6-qtbase-odbc-6.8.1-9.el10_0.x86_64_v2.rpm;unpack=0"
RDEPENDS:qt6-qtbase-odbc = "
 cmake-filesystem
 qt6-qtbase
 libstdc++
 unixODBC
 glibc
"

URI_qt6-qtbase-postgresql = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/qt6-qtbase-postgresql-6.8.1-9.el10_0.x86_64_v2.rpm;unpack=0"
RDEPENDS:qt6-qtbase-postgresql = "
 cmake-filesystem
 libpq
 qt6-qtbase
 libstdc++
 glibc
"

URI_qt6-qtbase-examples = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/qt6-qtbase-examples-6.8.1-9.el10_0.x86_64_v2.rpm;unpack=0"
RDEPENDS:qt6-qtbase-examples = "
 python3
 libgcc
 qt6-qtbase
 libstdc++
 qt6-qtbase-gui
 glibc
"

URI_qt6-qtbase-private-devel = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/qt6-qtbase-private-devel-6.8.1-9.el10_0.x86_64_v2.rpm;unpack=0"
RDEPENDS:qt6-qtbase-private-devel = "
 qt6-qtbase-gui
 qt6-qtbase-devel
 cmake-filesystem
 cups-devel
"

URI_qt6-qtbase-static = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/qt6-qtbase-static-6.8.1-9.el10_0.x86_64_v2.rpm;unpack=0"
RDEPENDS:qt6-qtbase-static = "
 glib2-devel
 cmake-filesystem
 zlib-ng-compat-devel
 fontconfig-devel
 qt6-qtbase-devel
 libxkbcommon-devel
 libinput-devel
"

URI_qt6-qtbase-tests = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/qt6-qtbase-tests-6.8.1-9.el10_0.x86_64_v2.rpm;unpack=0"
RDEPENDS:qt6-qtbase-tests = "
 python3
 perl-constant
 perl-libs
 libgcc
 qt6-qtbase
 libxcb
 libstdc++
 bash
 qt6-qtbase-gui
 glibc
 perl-interpreter
"
