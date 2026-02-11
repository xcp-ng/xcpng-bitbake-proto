
PN = "protobuf"
PE = "0"
PV = "3.19.6"
PR = "11.el10"
PACKAGES = "protobuf protobuf-lite python3-protobuf protobuf-compiler protobuf-devel protobuf-lite-devel protobuf-emacs protobuf-vim"


URI_protobuf = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/protobuf-3.19.6-11.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:protobuf = " \
 glibc \
 libgcc \
 libstdc++ \
 zlib-ng-compat \
"

URI_protobuf-lite = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/protobuf-lite-3.19.6-11.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:protobuf-lite = " \
 glibc \
 libgcc \
 libstdc++ \
 zlib-ng-compat \
"

URI_python3-protobuf = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/python3-protobuf-3.19.6-11.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:python3-protobuf = " \
 python3 \
 protobuf \
 libgcc \
 libstdc++ \
 glibc \
"

URI_protobuf-compiler = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/protobuf-compiler-3.19.6-11.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:protobuf-compiler = " \
 protobuf \
 zlib-ng-compat \
 libgcc \
 libstdc++ \
 glibc \
"

URI_protobuf-devel = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/protobuf-devel-3.19.6-11.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:protobuf-devel = " \
 protobuf \
 zlib-ng-compat-devel \
 pkgconf-pkg-config \
 protobuf-compiler \
"

URI_protobuf-lite-devel = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/protobuf-lite-devel-3.19.6-11.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:protobuf-lite-devel = " \
 protobuf-lite \
 pkgconf-pkg-config \
 protobuf-devel \
"

URI_protobuf-emacs = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/protobuf-emacs-3.19.6-11.el10.noarch.rpm;unpack=0"
RDEPENDS:protobuf-emacs = " \
 emacs-filesystem \
"

URI_protobuf-vim = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/protobuf-vim-3.19.6-11.el10.noarch.rpm;unpack=0"
RDEPENDS:protobuf-vim = " \
 vim-filesystem \
"
