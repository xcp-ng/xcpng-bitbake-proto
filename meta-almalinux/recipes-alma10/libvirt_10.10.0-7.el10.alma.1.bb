
inherit dnf-bridge

PN = "libvirt"
PE = "0"
PV = "10.10.0"
PR = "7.el10.alma.1"
PACKAGES = "libvirt libvirt-client libvirt-client-qemu libvirt-daemon libvirt-daemon-common libvirt-daemon-config-network libvirt-daemon-config-nwfilter libvirt-daemon-driver-interface libvirt-daemon-driver-network libvirt-daemon-driver-nodedev libvirt-daemon-driver-nwfilter libvirt-daemon-driver-qemu libvirt-daemon-driver-secret libvirt-daemon-driver-storage libvirt-daemon-driver-storage-core libvirt-daemon-driver-storage-disk libvirt-daemon-driver-storage-iscsi libvirt-daemon-driver-storage-logical libvirt-daemon-driver-storage-mpath libvirt-daemon-driver-storage-rbd libvirt-daemon-driver-storage-scsi libvirt-daemon-kvm libvirt-daemon-lock libvirt-daemon-log libvirt-daemon-plugin-lockd libvirt-daemon-proxy libvirt-libs libvirt-nss libvirt-ssh-proxy libvirt-daemon-plugin-sanlock libvirt-devel libvirt-docs libvirt-wireshark"


URI_libvirt = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/libvirt-10.10.0-7.el10.alma.1.x86_64_v2.rpm;unpack=0"
RDEPENDS:libvirt = " \
 libvirt-client-qemu \
 libvirt-daemon \
 libvirt-daemon-config-network \
 libvirt-daemon-config-nwfilter \
 libvirt-daemon-driver-interface \
 libvirt-daemon-driver-network \
 libvirt-daemon-driver-nodedev \
 libvirt-daemon-driver-nwfilter \
 libvirt-daemon-driver-qemu \
 libvirt-daemon-driver-secret \
 libvirt-daemon-driver-storage \
 libvirt-libs \
 libvirt-client \
"

URI_libvirt-client = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/libvirt-client-10.10.0-7.el10.alma.1.x86_64_v2.rpm;unpack=0"
RDEPENDS:libvirt-client = " \
 gnutls \
 libgcc \
 readline \
 libxml2 \
 bash \
 glib2 \
 glibc \
 libvirt-libs \
"

URI_libvirt-client-qemu = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/libvirt-client-qemu-10.10.0-7.el10.alma.1.x86_64_v2.rpm;unpack=0"
RDEPENDS:libvirt-client-qemu = " \
 python3 \
 python3-cryptography \
 python3-libvirt \
 python3-lxml \
 libvirt-libs \
"

URI_libvirt-daemon = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/libvirt-daemon-10.10.0-7.el10.alma.1.x86_64_v2.rpm;unpack=0"
RDEPENDS:libvirt-daemon = " \
 libvirt-daemon-common \
 libgcc \
 bash \
 glib2 \
 libvirt-daemon-lock \
 libvirt-daemon-log \
 glibc \
 libtirpc \
 libvirt-libs \
 libvirt-daemon-plugin-lockd \
 libvirt-daemon-proxy \
"

URI_libvirt-daemon-common = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/libvirt-daemon-common-10.10.0-7.el10.alma.1.x86_64_v2.rpm;unpack=0"
RDEPENDS:libvirt-daemon-common = " \
 libacl \
 shadow-utils \
 systemd \
 iproute \
 iproute-tc \
 libgcc \
 readline \
 dmidecode \
 gettext \
 polkit \
 bash \
 glib2 \
 dbus \
 glibc \
 libvirt-libs \
"

URI_libvirt-daemon-config-network = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/libvirt-daemon-config-network-10.10.0-7.el10.alma.1.x86_64_v2.rpm;unpack=0"
RDEPENDS:libvirt-daemon-config-network = " \
 bash \
 libvirt-daemon-driver-network \
"

URI_libvirt-daemon-config-nwfilter = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/libvirt-daemon-config-nwfilter-10.10.0-7.el10.alma.1.x86_64_v2.rpm;unpack=0"
RDEPENDS:libvirt-daemon-config-nwfilter = " \
 libvirt-daemon-driver-nwfilter \
 bash \
"

URI_libvirt-daemon-driver-interface = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/libvirt-daemon-driver-interface-10.10.0-7.el10.alma.1.x86_64_v2.rpm;unpack=0"
RDEPENDS:libvirt-daemon-driver-interface = " \
 libvirt-daemon-common \
 systemd-libs \
 libgcc \
 bash \
 glib2 \
 glibc \
 libtirpc \
 libvirt-libs \
"

URI_libvirt-daemon-driver-network = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/libvirt-daemon-driver-network-10.10.0-7.el10.alma.1.x86_64_v2.rpm;unpack=0"
RDEPENDS:libvirt-daemon-driver-network = " \
 libvirt-daemon-common \
 nftables \
 libgcc \
 dnsmasq \
 bash \
 glib2 \
 glibc \
 libtirpc \
 libvirt-libs \
"

URI_libvirt-daemon-driver-nodedev = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/libvirt-daemon-driver-nodedev-10.10.0-7.el10.alma.1.x86_64_v2.rpm;unpack=0"
RDEPENDS:libvirt-daemon-driver-nodedev = " \
 libpciaccess \
 libvirt-daemon-common \
 systemd \
 systemd-libs \
 kmod \
 libgcc \
 bash \
 glib2 \
 glibc \
 libtirpc \
 libvirt-libs \
 mdevctl \
"

URI_libvirt-daemon-driver-nwfilter = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/libvirt-daemon-driver-nwfilter-10.10.0-7.el10.alma.1.x86_64_v2.rpm;unpack=0"
RDEPENDS:libvirt-daemon-driver-nwfilter = " \
 libpcap \
 libvirt-daemon-common \
 libgcc \
 bash \
 glib2 \
 iptables-nft \
 glibc \
 libtirpc \
 libvirt-libs \
"

URI_libvirt-daemon-driver-qemu = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/libvirt-daemon-driver-qemu-10.10.0-7.el10.alma.1.x86_64_v2.rpm;unpack=0"
RDEPENDS:libvirt-daemon-driver-qemu = " \
 systemd-container \
 libnbd \
 libselinux \
 libvirt-daemon-common \
 numad \
 qemu-img \
 libvirt-daemon-log \
 libtirpc \
 libvirt-libs \
 xz \
 gnutls \
 zstd \
 libgcc \
 libxml2 \
 bash \
 bzip2 \
 gzip \
 lzop \
 glib2 \
 glibc \
 swtpm-tools \
"

URI_libvirt-daemon-driver-secret = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/libvirt-daemon-driver-secret-10.10.0-7.el10.alma.1.x86_64_v2.rpm;unpack=0"
RDEPENDS:libvirt-daemon-driver-secret = " \
 libvirt-daemon-common \
 libgcc \
 bash \
 glib2 \
 glibc \
 libtirpc \
 libvirt-libs \
"

URI_libvirt-daemon-driver-storage = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/libvirt-daemon-driver-storage-10.10.0-7.el10.alma.1.x86_64_v2.rpm;unpack=0"
RDEPENDS:libvirt-daemon-driver-storage = " \
 libvirt-daemon-driver-storage-core \
 libvirt-daemon-driver-storage-disk \
 libvirt-daemon-driver-storage-iscsi \
 libvirt-daemon-driver-storage-logical \
 libvirt-daemon-driver-storage-mpath \
 libvirt-daemon-driver-storage-rbd \
 libvirt-daemon-driver-storage-scsi \
"

URI_libvirt-daemon-driver-storage-core = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/libvirt-daemon-driver-storage-core-10.10.0-7.el10.alma.1.x86_64_v2.rpm;unpack=0"
RDEPENDS:libvirt-daemon-driver-storage-core = " \
 libvirt-daemon-common \
 util-linux \
 scrub \
 libgcc \
 libblkid \
 libxml2 \
 qemu-img \
 parted \
 libtirpc \
 bash \
 glib2 \
 glibc \
 libselinux \
 libvirt-libs \
"

URI_libvirt-daemon-driver-storage-disk = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/libvirt-daemon-driver-storage-disk-10.10.0-7.el10.alma.1.x86_64_v2.rpm;unpack=0"
RDEPENDS:libvirt-daemon-driver-storage-disk = " \
 device-mapper \
 libgcc \
 libvirt-daemon-driver-storage-core \
 parted \
 glib2 \
 glibc \
 libvirt-libs \
"

URI_libvirt-daemon-driver-storage-iscsi = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/libvirt-daemon-driver-storage-iscsi-10.10.0-7.el10.alma.1.x86_64_v2.rpm;unpack=0"
RDEPENDS:libvirt-daemon-driver-storage-iscsi = " \
 libgcc \
 libvirt-daemon-driver-storage-core \
 iscsi-initiator-utils \
 glib2 \
 glibc \
 libvirt-libs \
"

URI_libvirt-daemon-driver-storage-logical = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/libvirt-daemon-driver-storage-logical-10.10.0-7.el10.alma.1.x86_64_v2.rpm;unpack=0"
RDEPENDS:libvirt-daemon-driver-storage-logical = " \
 lvm2 \
 libgcc \
 libvirt-daemon-driver-storage-core \
 glib2 \
 glibc \
 libvirt-libs \
"

URI_libvirt-daemon-driver-storage-mpath = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/libvirt-daemon-driver-storage-mpath-10.10.0-7.el10.alma.1.x86_64_v2.rpm;unpack=0"
RDEPENDS:libvirt-daemon-driver-storage-mpath = " \
 device-mapper \
 device-mapper-libs \
 libgcc \
 libvirt-daemon-driver-storage-core \
 glib2 \
 glibc \
 libvirt-libs \
"

URI_libvirt-daemon-driver-storage-rbd = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/libvirt-daemon-driver-storage-rbd-10.10.0-7.el10.alma.1.x86_64_v2.rpm;unpack=0"
RDEPENDS:libvirt-daemon-driver-storage-rbd = " \
 librados2 \
 librbd1 \
 libgcc \
 libvirt-daemon-driver-storage-core \
 glib2 \
 glibc \
 libvirt-libs \
"

URI_libvirt-daemon-driver-storage-scsi = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/libvirt-daemon-driver-storage-scsi-10.10.0-7.el10.alma.1.x86_64_v2.rpm;unpack=0"
RDEPENDS:libvirt-daemon-driver-storage-scsi = " \
 libgcc \
 libvirt-daemon-driver-storage-core \
 glib2 \
 glibc \
 libvirt-libs \
"

URI_libvirt-daemon-kvm = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/libvirt-daemon-kvm-10.10.0-7.el10.alma.1.x86_64_v2.rpm;unpack=0"
RDEPENDS:libvirt-daemon-kvm = " \
 libvirt-daemon-common \
 libvirt-daemon-driver-interface \
 libvirt-daemon-driver-network \
 libvirt-daemon-driver-nodedev \
 libvirt-daemon-driver-nwfilter \
 libvirt-daemon-driver-qemu \
 libvirt-daemon-driver-secret \
 libvirt-daemon-driver-storage \
 qemu-kvm \
 libvirt-daemon-lock \
 libvirt-daemon-log \
 libvirt-daemon-plugin-lockd \
 libvirt-daemon-proxy \
 libvirt-ssh-proxy \
"

URI_libvirt-daemon-lock = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/libvirt-daemon-lock-10.10.0-7.el10.alma.1.x86_64_v2.rpm;unpack=0"
RDEPENDS:libvirt-daemon-lock = " \
 libgcc \
 bash \
 glib2 \
 glibc \
 libtirpc \
 libvirt-libs \
"

URI_libvirt-daemon-log = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/libvirt-daemon-log-10.10.0-7.el10.alma.1.x86_64_v2.rpm;unpack=0"
RDEPENDS:libvirt-daemon-log = " \
 libgcc \
 bash \
 glib2 \
 glibc \
 libtirpc \
 libvirt-libs \
"

URI_libvirt-daemon-plugin-lockd = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/libvirt-daemon-plugin-lockd-10.10.0-7.el10.alma.1.x86_64_v2.rpm;unpack=0"
RDEPENDS:libvirt-daemon-plugin-lockd = " \
 libgcc \
 libvirt-daemon-lock \
 glib2 \
 glibc \
 libtirpc \
 libvirt-libs \
"

URI_libvirt-daemon-proxy = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/libvirt-daemon-proxy-10.10.0-7.el10.alma.1.x86_64_v2.rpm;unpack=0"
RDEPENDS:libvirt-daemon-proxy = " \
 libgcc \
 bash \
 glib2 \
 glibc \
 libtirpc \
 libvirt-libs \
"

URI_libvirt-libs = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/libvirt-libs-10.10.0-7.el10.alma.1.x86_64_v2.rpm;unpack=0"
RDEPENDS:libvirt-libs = " \
 libacl \
 gnutls \
 numactl-libs \
 libssh \
 audit-libs \
 libgcc \
 json-c \
 libxml2 \
 libnl3 \
 libcap-ng \
 cyrus-sasl-gssapi \
 cyrus-sasl-lib \
 libtirpc \
 glib2 \
 libcurl \
 glibc \
 libselinux \
"

URI_libvirt-nss = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/libvirt-nss-10.10.0-7.el10.alma.1.x86_64_v2.rpm;unpack=0"
RDEPENDS:libvirt-nss = " \
 glibc \
 json-c \
 libvirt-daemon-driver-network \
"

URI_libvirt-ssh-proxy = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/libvirt-ssh-proxy-10.10.0-7.el10.alma.1.x86_64_v2.rpm;unpack=0"
RDEPENDS:libvirt-ssh-proxy = " \
 libgcc \
 libxml2 \
 glib2 \
 glibc \
 libvirt-libs \
"

URI_libvirt-daemon-plugin-sanlock = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/libvirt-daemon-plugin-sanlock-10.10.0-7.el10.alma.1.x86_64_v2.rpm;unpack=0"
RDEPENDS:libvirt-daemon-plugin-sanlock = " \
 augeas \
 sanlock-lib \
 sanlock \
 libgcc \
 bash \
 glib2 \
 glibc \
 libvirt-libs \
"

URI_libvirt-devel = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/libvirt-devel-10.10.0-7.el10.alma.1.x86_64_v2.rpm;unpack=0"
RDEPENDS:libvirt-devel = " \
 libvirt-devel \
 libvirt-libs \
 pkgconf-pkg-config \
"

URI_libvirt-docs = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/libvirt-docs-10.10.0-7.el10.alma.1.x86_64_v2.rpm;unpack=0"
RDEPENDS:libvirt-docs = ""

URI_libvirt-wireshark = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/libvirt-wireshark-10.10.0-7.el10.alma.1.x86_64_v2.rpm;unpack=0"
RDEPENDS:libvirt-wireshark = " \
 wireshark \
 wireshark-cli \
 glib2 \
 glibc \
 libtirpc \
 libvirt-libs \
"
