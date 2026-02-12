
inherit dnf-bridge

PN = "beakerlib"
PE = "0"
PV = "1.29.2"
PR = "2.el10"
PACKAGES = "beakerlib beakerlib-vim-syntax"


URI_src = "https://vault.almalinux.org/10.0/devel/Source/Packages/beakerlib-1.29.2-2.el10.src.rpm;unpack=0"
SRC_URI += "${URI_src}"

URI_beakerlib = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/beakerlib-1.29.2-2.el10.noarch.rpm;unpack=0"
SRC_URI += "${URI_beakerlib}"
RDEPENDS:beakerlib = " \
 nfs-utils \
 yum-utils \
 iproute \
 util-linux \
 gzip \
 tar \
 grep \
 curl \
 time \
 bash \
 which \
 bc \
 sed \
 coreutils \
"

URI_beakerlib-vim-syntax = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/beakerlib-vim-syntax-1.29.2-2.el10.noarch.rpm;unpack=0"
SRC_URI += "${URI_beakerlib-vim-syntax}"
RDEPENDS:beakerlib-vim-syntax = " \
 vim-common \
"
