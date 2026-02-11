
inherit dnf-bridge

PN = "cmake"
PE = "0"
PV = "3.30.5"
PR = "3.el10_0"
PACKAGES = "cmake cmake-data cmake-doc cmake-filesystem cmake-gui cmake-rpm-macros"


URI_cmake = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/cmake-3.30.5-3.el10_0.x86_64_v2.rpm;unpack=0"
RDEPENDS:cmake = " \
 cmake-data \
 zlib-ng-compat \
 cmake-filesystem \
 libarchive \
 cmake-rpm-macros \
 libgcc \
 make \
 libstdc++ \
 ncurses-libs \
 libuv \
 libcurl \
 glibc \
 expat \
"

URI_cmake-data = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/cmake-data-3.30.5-3.el10_0.noarch.rpm;unpack=0"
RDEPENDS:cmake-data = " \
 emacs-filesystem \
 cmake-filesystem \
 cmake-rpm-macros \
 vim-filesystem \
 cmake \
"

URI_cmake-doc = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/cmake-doc-3.30.5-3.el10_0.noarch.rpm;unpack=0"
RDEPENDS:cmake-doc = ""

URI_cmake-filesystem = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/cmake-filesystem-3.30.5-3.el10_0.x86_64_v2.rpm;unpack=0"
RDEPENDS:cmake-filesystem = ""

URI_cmake-gui = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/cmake-gui-3.30.5-3.el10_0.x86_64_v2.rpm;unpack=0"
RDEPENDS:cmake-gui = " \
 zlib-ng-compat \
 shared-mime-info \
 libarchive \
 libgcc \
 qt6-qtbase \
 libstdc++ \
 qt6-qtbase-gui \
 libuv \
 libcurl \
 glibc \
 hicolor-icon-theme \
 cmake \
"

URI_cmake-rpm-macros = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/cmake-rpm-macros-3.30.5-3.el10_0.noarch.rpm;unpack=0"
RDEPENDS:cmake-rpm-macros = " \
 python3 \
 rpm \
"
