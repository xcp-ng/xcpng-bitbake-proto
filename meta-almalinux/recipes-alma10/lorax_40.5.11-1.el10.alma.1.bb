
inherit dnf-bridge

PN = "lorax"
PE = "0"
PV = "40.5.11"
PR = "1.el10.alma.1"
PACKAGES = "lorax lorax-docs lorax-lmc-novirt lorax-lmc-virt lorax-templates-generic"


URI_src = "https://vault.almalinux.org/10.0/AppStream/Source/Packages/lorax-40.5.11-1.el10.alma.1.src.rpm;unpack=0"
SRC_URI += "${URI_src}"

URI_lorax = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/lorax-40.5.11-1.el10.alma.1.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_lorax}"
RDEPENDS:lorax = " \
 python3 \
 glibc-common \
 isomd5sum \
 kmod \
 lorax-templates-generic \
 kpartx \
 lorax-templates-rhel \
 python3-dnf \
 python3-kickstart \
 device-mapper \
 pbzip2 \
 util-linux \
 python3-librepo \
 python3-libselinux \
 dosfstools \
 dracut \
 python3-mako \
 xorriso \
 xz \
 e2fsprogs \
 xz-lzma-compat \
 parted \
 squashfs-tools \
 erofs-utils \
 grub2-pc \
 findutils \
 grub2-tools \
 pigz \
 gzip \
 gawk \
 python3-pycdio \
 cpio \
 glib2 \
 glibc \
 psmisc \
"

URI_lorax-docs = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/lorax-docs-40.5.11-1.el10.alma.1.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_lorax-docs}"
RDEPENDS:lorax-docs = " \
 lorax \
"

URI_lorax-lmc-novirt = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/lorax-lmc-novirt-40.5.11-1.el10.alma.1.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_lorax-lmc-novirt}"
RDEPENDS:lorax-lmc-novirt = " \
 python3-psutil \
 lorax \
 tar \
 anaconda-core \
 almalinux-logos \
 anaconda-install-env-deps \
 anaconda-tui \
"

URI_lorax-lmc-virt = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/lorax-lmc-virt-40.5.11-1.el10.alma.1.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_lorax-lmc-virt}"
RDEPENDS:lorax-lmc-virt = " \
 lorax \
 tar \
 edk2-ovmf \
 qemu-kvm \
"

URI_lorax-templates-generic = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/lorax-templates-generic-40.5.11-1.el10.alma.1.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_lorax-templates-generic}"
RDEPENDS:lorax-templates-generic = " \
 lorax \
"
