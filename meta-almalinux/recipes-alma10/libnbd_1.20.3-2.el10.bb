
inherit dnf-bridge

PN = "libnbd"
PE = "0"
PV = "1.20.3"
PR = "2.el10"
PACKAGES = "libnbd libnbd-bash-completion nbdfuse python3-libnbd libnbd-devel ocaml-libnbd ocaml-libnbd-devel"


URI_libnbd = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/libnbd-1.20.3-2.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:libnbd = " \
 glibc \
 gnutls \
 libxml2 \
"

URI_libnbd-bash-completion = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/libnbd-bash-completion-1.20.3-2.el10.noarch.rpm;unpack=0"
RDEPENDS:libnbd-bash-completion = " \
 bash-completion \
 libnbd \
"

URI_nbdfuse = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/nbdfuse-1.20.3-2.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:nbdfuse = " \
 glibc \
 fuse3-libs \
 libnbd \
"

URI_python3-libnbd = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/python3-libnbd-1.20.3-2.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:python3-libnbd = " \
 python3 \
 gnutls \
 libxml2 \
 bash \
 libnbd \
 glibc \
"

URI_libnbd-devel = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/libnbd-devel-1.20.3-2.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:libnbd-devel = " \
 pkgconf-pkg-config \
 libnbd \
"

URI_ocaml-libnbd = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/ocaml-libnbd-1.20.3-2.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:ocaml-libnbd = " \
 glibc \
 ocaml-runtime \
 libnbd \
"

URI_ocaml-libnbd-devel = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/ocaml-libnbd-devel-1.20.3-2.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:ocaml-libnbd-devel = " \
 ocaml-libnbd \
 ocaml-runtime \
 ocaml \
"
