
inherit dnf-bridge

PN = "util-linux"
PE = "0"
PV = "2.40.2"
PR = "10.el10"
PACKAGES = "libblkid libfdisk libmount libsmartcols libuuid util-linux util-linux-core libblkid-devel libmount-devel libuuid-devel python3-libmount uuidd libfdisk-devel libsmartcols-devel util-linux-i18n"


URI_src = "https://vault.almalinux.org/10.0/BaseOS/Source/Packages/util-linux-2.40.2-10.el10.src.rpm;unpack=0"
SRC_URI += "${URI_src}"

URI_libblkid = "https://vault.almalinux.org/10.0/BaseOS/x86_64_v2/os/Packages/libblkid-2.40.2-10.el10.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_libblkid}"
RDEPENDS:libblkid = " \
 glibc \
 libuuid \
"

URI_libfdisk = "https://vault.almalinux.org/10.0/BaseOS/x86_64_v2/os/Packages/libfdisk-2.40.2-10.el10.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_libfdisk}"
RDEPENDS:libfdisk = " \
 glibc \
 libuuid \
 libblkid \
"

URI_libmount = "https://vault.almalinux.org/10.0/BaseOS/x86_64_v2/os/Packages/libmount-2.40.2-10.el10.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_libmount}"
RDEPENDS:libmount = " \
 glibc \
 libselinux \
 libuuid \
 libblkid \
"

URI_libsmartcols = "https://vault.almalinux.org/10.0/BaseOS/x86_64_v2/os/Packages/libsmartcols-2.40.2-10.el10.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_libsmartcols}"
RDEPENDS:libsmartcols = " \
 glibc \
"

URI_libuuid = "https://vault.almalinux.org/10.0/BaseOS/x86_64_v2/os/Packages/libuuid-2.40.2-10.el10.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_libuuid}"
RDEPENDS:libuuid = " \
 glibc \
"

URI_util-linux = "https://vault.almalinux.org/10.0/BaseOS/x86_64_v2/os/Packages/util-linux-2.40.2-10.el10.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_util-linux}"
RDEPENDS:util-linux = " \
 systemd-libs \
 ncurses-libs \
 libselinux \
 libsmartcols \
 util-linux-core \
 libblkid \
 libcap-ng \
 libutempter \
 libuuid \
 zlib-ng-compat \
 libfdisk \
 audit-libs \
 authselect-libs \
 pam \
 pam-libs \
 bash \
 readline \
 libmount \
 glibc \
 coreutils \
"

URI_util-linux-core = "https://vault.almalinux.org/10.0/BaseOS/x86_64_v2/os/Packages/util-linux-core-2.40.2-10.el10.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_util-linux-core}"
RDEPENDS:util-linux-core = " \
 libuuid \
 systemd-libs \
 libxcrypt \
 libblkid \
 libmount \
 ncurses-libs \
 glibc \
 libselinux \
 libsmartcols \
"

URI_libblkid-devel = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/libblkid-devel-2.40.2-10.el10.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_libblkid-devel}"
RDEPENDS:libblkid-devel = " \
 libblkid \
 pkgconf-pkg-config \
"

URI_libmount-devel = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/libmount-devel-2.40.2-10.el10.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_libmount-devel}"
RDEPENDS:libmount-devel = " \
 libblkid-devel \
 libmount \
 libselinux-devel \
 pkgconf-pkg-config \
"

URI_libuuid-devel = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/libuuid-devel-2.40.2-10.el10.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_libuuid-devel}"
RDEPENDS:libuuid-devel = " \
 libuuid \
 pkgconf-pkg-config \
"

URI_python3-libmount = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/python3-libmount-2.40.2-10.el10.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_python3-libmount}"
RDEPENDS:python3-libmount = " \
 python3 \
 libblkid \
 libmount \
 glibc \
 libselinux \
"

URI_uuidd = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/uuidd-2.40.2-10.el10.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_uuidd}"
RDEPENDS:uuidd = " \
 libuuid \
 shadow-utils \
 systemd-libs \
 bash \
 glibc \
"

URI_libfdisk-devel = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/libfdisk-devel-2.40.2-10.el10.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_libfdisk-devel}"
RDEPENDS:libfdisk-devel = " \
 libblkid-devel \
 libuuid-devel \
 pkgconf-pkg-config \
 libfdisk \
"

URI_libsmartcols-devel = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/libsmartcols-devel-2.40.2-10.el10.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_libsmartcols-devel}"
RDEPENDS:libsmartcols-devel = " \
 pkgconf-pkg-config \
 libsmartcols \
"

URI_util-linux-i18n = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/util-linux-i18n-2.40.2-10.el10.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_util-linux-i18n}"
RDEPENDS:util-linux-i18n = " \
 util-linux \
"
