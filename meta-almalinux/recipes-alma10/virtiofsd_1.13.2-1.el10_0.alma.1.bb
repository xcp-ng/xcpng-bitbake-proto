
inherit dnf-bridge

PN = "virtiofsd"
PE = "0"
PV = "1.13.2"
PR = "1.el10_0.alma.1"
PACKAGES = "virtiofsd"


URI_src = "https://vault.almalinux.org/10.0/AppStream/Source/Packages/virtiofsd-1.13.2-1.el10_0.alma.1.src.rpm;unpack=0"
SRC_URI += "${URI_src}"

URI_virtiofsd = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/virtiofsd-1.13.2-1.el10_0.alma.1.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_virtiofsd}"
RDEPENDS:virtiofsd = " \
 shadow-utils \
 libgcc \
 libcap-ng \
 libseccomp \
 glibc \
 qemu-kvm-common \
"
