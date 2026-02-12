
inherit dnf-bridge

PN = "systemd"
PE = "0"
PV = "257"
PR = "9.el10_0.1.alma.1"
PACKAGES = "systemd systemd-container systemd-libs systemd-oomd systemd-pam systemd-resolved systemd-rpm-macros systemd-udev systemd-boot-unsigned systemd-devel systemd-journal-remote systemd-ukify"


URI_src = "https://vault.almalinux.org/10.0/BaseOS/Source/Packages/systemd-257-9.el10_0.1.alma.1.src.rpm;unpack=0"
SRC_URI += "${URI_src}"

URI_systemd = "https://vault.almalinux.org/10.0/BaseOS/x86_64_v2/os/Packages/systemd-257-9.el10_0.1.alma.1.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_systemd}"
RDEPENDS:systemd = " \
 systemd-libs \
 systemd-pam \
 systemd-rpm-macros \
 dbus \
 libseccomp \
 libselinux \
 libacl \
 util-linux \
 libblkid \
 libcap \
 xz-libs \
 zlib-ng-compat \
 libfdisk \
 libxcrypt \
 audit-libs \
 openssl-libs \
 libgcc \
 grep \
 pam-libs \
 bash \
 bzip2-libs \
 libmount \
 glibc \
 coreutils \
"

URI_systemd-container = "https://vault.almalinux.org/10.0/BaseOS/x86_64_v2/os/Packages/systemd-container-257-9.el10_0.1.alma.1.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_systemd-container}"
RDEPENDS:systemd-container = " \
 libacl \
 systemd \
 zlib-ng-compat \
 bzip2-libs \
 libseccomp \
 libgcc \
 openssl-libs \
 libcap \
 libcurl \
 glibc \
 libselinux \
 xz-libs \
"

URI_systemd-libs = "https://vault.almalinux.org/10.0/BaseOS/x86_64_v2/os/Packages/systemd-libs-257-9.el10_0.1.alma.1.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_systemd-libs}"
RDEPENDS:systemd-libs = " \
 glibc \
 libgcc \
 libcap \
"

URI_systemd-oomd = "https://vault.almalinux.org/10.0/BaseOS/x86_64_v2/os/Packages/systemd-oomd-257-9.el10_0.1.alma.1.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_systemd-oomd}"
RDEPENDS:systemd-oomd = " \
 systemd \
 systemd-udev \
 libgcc \
 bash \
 glibc \
"

URI_systemd-pam = "https://vault.almalinux.org/10.0/BaseOS/x86_64_v2/os/Packages/systemd-pam-257-9.el10_0.1.alma.1.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_systemd-pam}"
RDEPENDS:systemd-pam = " \
 systemd \
 libgcc \
 libcap \
 pam-libs \
 glibc \
"

URI_systemd-resolved = "https://vault.almalinux.org/10.0/BaseOS/x86_64_v2/os/Packages/systemd-resolved-257-9.el10_0.1.alma.1.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_systemd-resolved}"
RDEPENDS:systemd-resolved = " \
 shadow-utils \
 systemd \
 libgcc \
 openssl-libs \
 grep \
 bash \
 glibc \
 libidn2 \
"

URI_systemd-rpm-macros = "https://vault.almalinux.org/10.0/BaseOS/x86_64_v2/os/Packages/systemd-rpm-macros-257-9.el10_0.1.alma.1.noarch.rpm;unpack=0"
SRC_URI += "${URI_systemd-rpm-macros}"
RDEPENDS:systemd-rpm-macros = " \
 bash \
"

URI_systemd-udev = "https://vault.almalinux.org/10.0/BaseOS/x86_64_v2/os/Packages/systemd-udev-257-9.el10_0.1.alma.1.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_systemd-udev}"
RDEPENDS:systemd-udev = " \
 systemd \
 grubby \
 libfdisk \
 cryptsetup-libs \
 kmod \
 libgcc \
 openssl-libs \
 grep \
 libblkid \
 kmod-libs \
 kbd \
 bash \
 glibc \
"

URI_systemd-boot-unsigned = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/systemd-boot-unsigned-257-9.el10_0.1.alma.1.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_systemd-boot-unsigned}"
RDEPENDS:systemd-boot-unsigned = ""

URI_systemd-devel = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/systemd-devel-257-9.el10_0.1.alma.1.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_systemd-devel}"
RDEPENDS:systemd-devel = " \
 systemd-rpm-macros \
 systemd-libs \
"

URI_systemd-journal-remote = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/systemd-journal-remote-257-9.el10_0.1.alma.1.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_systemd-journal-remote}"
RDEPENDS:systemd-journal-remote = " \
 firewalld-filesystem \
 systemd \
 libgcc \
 libmicrohttpd \
 bash \
 libcurl \
 glibc \
"

URI_systemd-ukify = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/systemd-ukify-257-9.el10_0.1.alma.1.noarch.rpm;unpack=0"
SRC_URI += "${URI_systemd-ukify}"
RDEPENDS:systemd-ukify = " \
 python3 \
 systemd \
 python3-pefile \
 python3-cryptography \
 systemd-boot-unsigned \
 python3-zstd \
"
