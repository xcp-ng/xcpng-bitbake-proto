
inherit dnf-bridge

PN = "espeak-ng"
PE = "0"
PV = "1.51.1"
PR = "10.el10"
PACKAGES = "espeak-ng espeak-ng-devel espeak-ng-doc espeak-ng-vim"


URI_espeak-ng = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/espeak-ng-1.51.1-10.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:espeak-ng = " \
 glibc \
 libgcc \
 libstdc++ \
 pcaudiolib \
"

URI_espeak-ng-devel = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/espeak-ng-devel-1.51.1-10.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:espeak-ng-devel = " \
 espeak-ng \
 pkgconf-pkg-config \
"

URI_espeak-ng-doc = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/espeak-ng-doc-1.51.1-10.el10.noarch.rpm;unpack=0"
RDEPENDS:espeak-ng-doc = " \
 espeak-ng \
"

URI_espeak-ng-vim = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/espeak-ng-vim-1.51.1-10.el10.noarch.rpm;unpack=0"
RDEPENDS:espeak-ng-vim = " \
 espeak-ng \
"
