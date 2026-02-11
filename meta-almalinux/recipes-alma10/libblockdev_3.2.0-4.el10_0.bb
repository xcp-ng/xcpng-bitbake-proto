
PN = "libblockdev"
PE = "0"
PV = "3.2.0"
PR = "4.el10_0"
PACKAGES = "libblockdev libblockdev-crypto libblockdev-dm libblockdev-fs libblockdev-loop libblockdev-lvm libblockdev-lvm-dbus libblockdev-mdraid libblockdev-mpath libblockdev-nvdimm libblockdev-nvme libblockdev-part libblockdev-plugins-all libblockdev-smart libblockdev-smartmontools libblockdev-swap libblockdev-tools libblockdev-utils python3-blockdev libblockdev-crypto-devel libblockdev-devel libblockdev-dm-devel libblockdev-fs-devel libblockdev-loop-devel libblockdev-lvm-dbus-devel libblockdev-lvm-devel libblockdev-mdraid-devel libblockdev-mpath-devel libblockdev-nvdimm-devel libblockdev-nvme-devel libblockdev-part-devel libblockdev-smart-devel libblockdev-smartmontools-devel libblockdev-swap-devel libblockdev-utils-devel"


URI_libblockdev = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/libblockdev-3.2.0-4.el10_0.x86_64_v2.rpm;unpack=0"
RDEPENDS:libblockdev = " \
 systemd-libs \
 kmod-libs \
 glib2 \
 glibc \
 libblockdev-utils \
"

URI_libblockdev-crypto = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/libblockdev-crypto-3.2.0-4.el10_0.x86_64_v2.rpm;unpack=0"
RDEPENDS:libblockdev-crypto = " \
 nss \
 systemd-libs \
 cryptsetup-libs \
 keyutils-libs \
 libgcc \
 kmod-libs \
 libblkid \
 libblockdev-utils \
 nss-util \
 glib2 \
 volume_key-libs \
 glibc \
 nspr \
"

URI_libblockdev-dm = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/libblockdev-dm-3.2.0-4.el10_0.x86_64_v2.rpm;unpack=0"
RDEPENDS:libblockdev-dm = " \
 device-mapper \
 device-mapper-libs \
 systemd-libs \
 kmod-libs \
 glib2 \
 glibc \
 libblockdev-utils \
"

URI_libblockdev-fs = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/libblockdev-fs-3.2.0-4.el10_0.x86_64_v2.rpm;unpack=0"
RDEPENDS:libblockdev-fs = " \
 libuuid \
 e2fsprogs-libs \
 systemd-libs \
 libgcc \
 kmod-libs \
 libblkid \
 libmount \
 glib2 \
 glibc \
 libblockdev-utils \
"

URI_libblockdev-loop = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/libblockdev-loop-3.2.0-4.el10_0.x86_64_v2.rpm;unpack=0"
RDEPENDS:libblockdev-loop = " \
 systemd-libs \
 libgcc \
 kmod-libs \
 glib2 \
 glibc \
 libblockdev-utils \
"

URI_libblockdev-lvm = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/libblockdev-lvm-3.2.0-4.el10_0.x86_64_v2.rpm;unpack=0"
RDEPENDS:libblockdev-lvm = " \
 device-mapper-libs \
 systemd-libs \
 lvm2 \
 libgcc \
 kmod-libs \
 libyaml \
 glib2 \
 glibc \
 libblockdev-utils \
"

URI_libblockdev-lvm-dbus = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/libblockdev-lvm-dbus-3.2.0-4.el10_0.x86_64_v2.rpm;unpack=0"
RDEPENDS:libblockdev-lvm-dbus = " \
 device-mapper-libs \
 systemd-libs \
 libgcc \
 kmod-libs \
 libyaml \
 glib2 \
 glibc \
 lvm2-dbusd \
 libblockdev-utils \
"

URI_libblockdev-mdraid = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/libblockdev-mdraid-3.2.0-4.el10_0.x86_64_v2.rpm;unpack=0"
RDEPENDS:libblockdev-mdraid = " \
 libbytesize \
 systemd-libs \
 libgcc \
 kmod-libs \
 glib2 \
 mdadm \
 glibc \
 libblockdev-utils \
"

URI_libblockdev-mpath = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/libblockdev-mpath-3.2.0-4.el10_0.x86_64_v2.rpm;unpack=0"
RDEPENDS:libblockdev-mpath = " \
 device-mapper-libs \
 systemd-libs \
 kmod-libs \
 glib2 \
 glibc \
 libblockdev-utils \
"

URI_libblockdev-nvdimm = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/libblockdev-nvdimm-3.2.0-4.el10_0.x86_64_v2.rpm;unpack=0"
RDEPENDS:libblockdev-nvdimm = " \
 libuuid \
 systemd-libs \
 kmod-libs \
 glib2 \
 ndctl \
 ndctl-libs \
 glibc \
 libblockdev-utils \
"

URI_libblockdev-nvme = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/libblockdev-nvme-3.2.0-4.el10_0.x86_64_v2.rpm;unpack=0"
RDEPENDS:libblockdev-nvme = " \
 systemd-libs \
 kmod-libs \
 glib2 \
 glibc \
 libnvme \
 libblockdev-utils \
"

URI_libblockdev-part = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/libblockdev-part-3.2.0-4.el10_0.x86_64_v2.rpm;unpack=0"
RDEPENDS:libblockdev-part = " \
 systemd-libs \
 libfdisk \
 util-linux \
 kmod-libs \
 glib2 \
 glibc \
 libblockdev-utils \
"

URI_libblockdev-plugins-all = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/libblockdev-plugins-all-3.2.0-4.el10_0.x86_64_v2.rpm;unpack=0"
RDEPENDS:libblockdev-plugins-all = " \
 libblockdev-mdraid \
 libblockdev-mpath \
 libblockdev-nvdimm \
 libblockdev-nvme \
 libblockdev \
 libblockdev-part \
 libblockdev-crypto \
 libblockdev-dm \
 libblockdev-smart \
 libblockdev-fs \
 libblockdev-smartmontools \
 libblockdev-loop \
 libblockdev-swap \
 libblockdev-lvm \
"

URI_libblockdev-smart = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/libblockdev-smart-3.2.0-4.el10_0.x86_64_v2.rpm;unpack=0"
RDEPENDS:libblockdev-smart = " \
 systemd-libs \
 libatasmart \
 kmod-libs \
 glib2 \
 glibc \
 libblockdev-utils \
"

URI_libblockdev-smartmontools = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/libblockdev-smartmontools-3.2.0-4.el10_0.x86_64_v2.rpm;unpack=0"
RDEPENDS:libblockdev-smartmontools = " \
 systemd-libs \
 smartmontools \
 kmod-libs \
 json-glib \
 glib2 \
 glibc \
 libblockdev-utils \
"

URI_libblockdev-swap = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/libblockdev-swap-3.2.0-4.el10_0.x86_64_v2.rpm;unpack=0"
RDEPENDS:libblockdev-swap = " \
 libuuid \
 systemd-libs \
 util-linux \
 libgcc \
 kmod-libs \
 libblkid \
 glib2 \
 glibc \
 libblockdev-utils \
"

URI_libblockdev-tools = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/libblockdev-tools-3.2.0-4.el10_0.x86_64_v2.rpm;unpack=0"
RDEPENDS:libblockdev-tools = " \
 libbytesize \
 libblockdev \
 parted \
 glib2 \
 glibc \
 libblockdev-lvm \
"

URI_libblockdev-utils = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/libblockdev-utils-3.2.0-4.el10_0.x86_64_v2.rpm;unpack=0"
RDEPENDS:libblockdev-utils = " \
 glibc \
 kmod-libs \
 glib2 \
 systemd-libs \
"

URI_python3-blockdev = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/python3-blockdev-3.2.0-4.el10_0.x86_64_v2.rpm;unpack=0"
RDEPENDS:python3-blockdev = " \
 python3 \
 python3-bytesize \
 libblockdev \
 python3-gobject-base \
"

URI_libblockdev-crypto-devel = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/libblockdev-crypto-devel-3.2.0-4.el10_0.x86_64_v2.rpm;unpack=0"
RDEPENDS:libblockdev-crypto-devel = " \
 glib2-devel \
 libblockdev-utils-devel \
 libblockdev-crypto \
"

URI_libblockdev-devel = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/libblockdev-devel-3.2.0-4.el10_0.x86_64_v2.rpm;unpack=0"
RDEPENDS:libblockdev-devel = " \
 libblockdev-utils-devel \
 glib2-devel \
 libblockdev \
 pkgconf-pkg-config \
"

URI_libblockdev-dm-devel = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/libblockdev-dm-devel-3.2.0-4.el10_0.x86_64_v2.rpm;unpack=0"
RDEPENDS:libblockdev-dm-devel = " \
 glib2-devel \
 systemd-devel \
 libblockdev-dm \
 libblockdev-utils-devel \
 device-mapper-devel \
"

URI_libblockdev-fs-devel = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/libblockdev-fs-devel-3.2.0-4.el10_0.x86_64_v2.rpm;unpack=0"
RDEPENDS:libblockdev-fs-devel = " \
 glib2-devel \
 libblockdev-utils-devel \
 libblockdev-fs \
"

URI_libblockdev-loop-devel = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/libblockdev-loop-devel-3.2.0-4.el10_0.x86_64_v2.rpm;unpack=0"
RDEPENDS:libblockdev-loop-devel = " \
 libblockdev-loop \
 glib2-devel \
 libblockdev-utils-devel \
"

URI_libblockdev-lvm-dbus-devel = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/libblockdev-lvm-dbus-devel-3.2.0-4.el10_0.x86_64_v2.rpm;unpack=0"
RDEPENDS:libblockdev-lvm-dbus-devel = " \
 glib2-devel \
 libblockdev-utils-devel \
 libblockdev-lvm-dbus \
"

URI_libblockdev-lvm-devel = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/libblockdev-lvm-devel-3.2.0-4.el10_0.x86_64_v2.rpm;unpack=0"
RDEPENDS:libblockdev-lvm-devel = " \
 glib2-devel \
 libblockdev-utils-devel \
 libblockdev-lvm \
"

URI_libblockdev-mdraid-devel = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/libblockdev-mdraid-devel-3.2.0-4.el10_0.x86_64_v2.rpm;unpack=0"
RDEPENDS:libblockdev-mdraid-devel = " \
 libblockdev-mdraid \
 glib2-devel \
 libblockdev-utils-devel \
"

URI_libblockdev-mpath-devel = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/libblockdev-mpath-devel-3.2.0-4.el10_0.x86_64_v2.rpm;unpack=0"
RDEPENDS:libblockdev-mpath-devel = " \
 libblockdev-utils-devel \
 glib2-devel \
 libblockdev-mpath \
"

URI_libblockdev-nvdimm-devel = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/libblockdev-nvdimm-devel-3.2.0-4.el10_0.x86_64_v2.rpm;unpack=0"
RDEPENDS:libblockdev-nvdimm-devel = " \
 glib2-devel \
 libblockdev-utils-devel \
 libblockdev-nvdimm \
"

URI_libblockdev-nvme-devel = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/libblockdev-nvme-devel-3.2.0-4.el10_0.x86_64_v2.rpm;unpack=0"
RDEPENDS:libblockdev-nvme-devel = " \
 libblockdev-nvme \
 glib2-devel \
 libblockdev-utils-devel \
"

URI_libblockdev-part-devel = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/libblockdev-part-devel-3.2.0-4.el10_0.x86_64_v2.rpm;unpack=0"
RDEPENDS:libblockdev-part-devel = " \
 glib2-devel \
 libblockdev-utils-devel \
 libblockdev-part \
"

URI_libblockdev-smart-devel = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/libblockdev-smart-devel-3.2.0-4.el10_0.x86_64_v2.rpm;unpack=0"
RDEPENDS:libblockdev-smart-devel = " \
 glib2-devel \
 libblockdev-utils-devel \
 libblockdev-smart \
"

URI_libblockdev-smartmontools-devel = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/libblockdev-smartmontools-devel-3.2.0-4.el10_0.x86_64_v2.rpm;unpack=0"
RDEPENDS:libblockdev-smartmontools-devel = " \
 glib2-devel \
 libblockdev-utils-devel \
 libblockdev-smartmontools \
"

URI_libblockdev-swap-devel = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/libblockdev-swap-devel-3.2.0-4.el10_0.x86_64_v2.rpm;unpack=0"
RDEPENDS:libblockdev-swap-devel = " \
 libblockdev-swap \
 glib2-devel \
 libblockdev-utils-devel \
"

URI_libblockdev-utils-devel = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/libblockdev-utils-devel-3.2.0-4.el10_0.x86_64_v2.rpm;unpack=0"
RDEPENDS:libblockdev-utils-devel = " \
 glib2-devel \
 pkgconf-pkg-config \
 libblockdev-utils \
"
