
inherit dnf-bridge

PN = "udisks2"
PE = "0"
PV = "2.10.90"
PR = "5.el10_0.1"
PACKAGES = "libudisks2 udisks2 udisks2-iscsi udisks2-lsm udisks2-lvm2 libudisks2-devel"


URI_src = "https://vault.almalinux.org/10.0/AppStream/Source/Packages/udisks2-2.10.90-5.el10_0.1.src.rpm;unpack=0"
SRC_URI += "${URI_src}"

URI_libudisks2 = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/libudisks2-2.10.90-5.el10_0.1.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_libudisks2}"
RDEPENDS:libudisks2 = " \
 glibc \
 glib2 \
"

URI_udisks2 = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/udisks2-2.10.90-5.el10_0.1.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_udisks2}"
RDEPENDS:udisks2 = " \
 systemd-libs \
 systemd-udev \
 libudisks2 \
 dbus \
 libacl \
 util-linux \
 libblkid \
 libuuid \
 libgcc \
 libblockdev \
 libblockdev-crypto \
 libgudev \
 bash \
 libblockdev-fs \
 libblockdev-loop \
 libblockdev-mdraid \
 libblockdev-nvme \
 libmount \
 libblockdev-part \
 polkit \
 polkit-libs \
 libblockdev-smart \
 glib2 \
 glibc \
 libblockdev-swap \
 libblockdev-utils \
"

URI_udisks2-iscsi = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/udisks2-iscsi-2.10.90-5.el10_0.1.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_udisks2-iscsi}"
RDEPENDS:udisks2-iscsi = " \
 libuuid \
 libacl \
 systemd-libs \
 libgcc \
 libblkid \
 libmount \
 libblockdev \
 libudisks2 \
 libgudev \
 iscsi-initiator-utils \
 polkit-libs \
 glib2 \
 glibc \
 libblockdev-utils \
"

URI_udisks2-lsm = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/udisks2-lsm-2.10.90-5.el10_0.1.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_udisks2-lsm}"
RDEPENDS:udisks2-lsm = " \
 libuuid \
 libacl \
 systemd-libs \
 libgcc \
 libblkid \
 libmount \
 libblockdev \
 libudisks2 \
 libgudev \
 libstoragemgmt \
 polkit-libs \
 glib2 \
 libconfig \
 glibc \
 libblockdev-utils \
"

URI_udisks2-lvm2 = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/udisks2-lvm2-2.10.90-5.el10_0.1.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_udisks2-lvm2}"
RDEPENDS:udisks2-lvm2 = " \
 libuuid \
 libacl \
 systemd-libs \
 lvm2 \
 libgcc \
 libblkid \
 libmount \
 libblockdev \
 libudisks2 \
 libgudev \
 polkit-libs \
 glib2 \
 glibc \
 libblockdev-lvm \
 libblockdev-utils \
"

URI_libudisks2-devel = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/libudisks2-devel-2.10.90-5.el10_0.1.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_libudisks2-devel}"
RDEPENDS:libudisks2-devel = " \
 glib2-devel \
 pkgconf-pkg-config \
 libudisks2-devel \
 libudisks2 \
"
