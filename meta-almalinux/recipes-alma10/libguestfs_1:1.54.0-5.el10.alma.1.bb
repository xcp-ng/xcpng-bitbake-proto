
inherit dnf-bridge

PN = "libguestfs"
PE = "1"
PV = "1.54.0"
PR = "5.el10.alma.1"
PACKAGES = "libguestfs libguestfs-appliance libguestfs-bash-completion libguestfs-inspect-icons libguestfs-rescue libguestfs-rsync libguestfs-xfs perl-Sys-Guestfs python3-libguestfs libguestfs-devel libguestfs-man-pages-ja libguestfs-man-pages-uk ocaml-libguestfs ocaml-libguestfs-devel"


URI_src = "https://vault.almalinux.org/10.0/AppStream/Source/Packages/libguestfs-1.54.0-5.el10.alma.1.src.rpm;unpack=0"
SRC_URI += "${URI_src}"

URI_libguestfs = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/libguestfs-1.54.0-5.el10.alma.1.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_libguestfs}"
RDEPENDS:libguestfs = " \
 systemd-libs \
 tar \
 ncurses-libs \
 libselinux \
 hexedit \
 hivex-libs \
 less \
 libacl \
 libvirt-daemon-driver-qemu \
 libvirt-daemon-driver-secret \
 qemu-img \
 json-c \
 libvirt-daemon-driver-storage-core \
 libcap \
 vim-minimal \
 libconfig \
 libtirpc \
 libvirt-libs \
 selinux-policy \
 xz \
 qemu-kvm-core \
 augeas-libs \
 libgcc \
 libxml2 \
 grep \
 bash \
 pcre2 \
 libguestfs-appliance \
 fuse \
 fuse-libs \
 readline \
 man-db \
 glibc \
 coreutils \
 rpm-libs \
"

URI_libguestfs-appliance = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/libguestfs-appliance-1.54.0-5.el10.alma.1.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_libguestfs-appliance}"
RDEPENDS:libguestfs-appliance = " \
 systemd \
 glibc-gconv-extra \
 systemd-libs \
 cryptsetup \
 iproute \
 systemd-udev \
 tar \
 kmod \
 procps-ng \
 libselinux \
 scrub \
 hivex-libs \
 less \
 libacl \
 util-linux \
 psmisc \
 diffutils \
 dhcpcd \
 json-c \
 acl \
 libcap \
 supermin \
 dosfstools \
 sed \
 libtirpc \
 xz \
 e2fsprogs \
 zstd \
 augeas-libs \
 attr \
 kernel \
 libgcc \
 grep \
 libxml2 \
 parted \
 bash \
 clevis-luks \
 pcre2 \
 binutils \
 file \
 findutils \
 bzip2 \
 lsscsi \
 lvm2 \
 gzip \
 gawk \
 lzop \
 policycoreutils \
 mdadm \
 glibc \
 coreutils \
 cpio \
 rpm-libs \
"

URI_libguestfs-bash-completion = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/libguestfs-bash-completion-1.54.0-5.el10.alma.1.noarch.rpm;unpack=0"
SRC_URI += "${URI_libguestfs-bash-completion}"
RDEPENDS:libguestfs-bash-completion = " \
 bash-completion \
"

URI_libguestfs-inspect-icons = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/libguestfs-inspect-icons-1.54.0-5.el10.alma.1.noarch.rpm;unpack=0"
SRC_URI += "${URI_libguestfs-inspect-icons}"
RDEPENDS:libguestfs-inspect-icons = " \
 icoutils \
 netpbm-progs \
 libguestfs \
"

URI_libguestfs-rescue = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/libguestfs-rescue-1.54.0-5.el10.alma.1.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_libguestfs-rescue}"
RDEPENDS:libguestfs-rescue = " \
 lsof \
 openssh-clients \
 libgcc \
 libxml2 \
 iputils \
 pciutils \
 vim-minimal \
 libconfig \
 strace \
 libguestfs \
 glibc \
"

URI_libguestfs-rsync = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/libguestfs-rsync-1.54.0-5.el10.alma.1.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_libguestfs-rsync}"
RDEPENDS:libguestfs-rsync = " \
 rsync \
 libguestfs \
"

URI_libguestfs-xfs = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/libguestfs-xfs-1.54.0-5.el10.alma.1.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_libguestfs-xfs}"
RDEPENDS:libguestfs-xfs = " \
 xfsprogs \
 libguestfs \
"

URI_perl-Sys-Guestfs = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/perl-Sys-Guestfs-1.54.0-5.el10.alma.1.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_perl-Sys-Guestfs}"
RDEPENDS:perl-Sys-Guestfs = " \
 glibc \
 perl-libs \
 perl-vars \
 libguestfs \
"

URI_python3-libguestfs = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/python3-libguestfs-1.54.0-5.el10.alma.1.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_python3-libguestfs}"
RDEPENDS:python3-libguestfs = " \
 glibc \
 python3 \
 libguestfs \
"

URI_libguestfs-devel = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/libguestfs-devel-1.54.0-5.el10.alma.1.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_libguestfs-devel}"
RDEPENDS:libguestfs-devel = " \
 pkgconf-pkg-config \
 libguestfs \
"

URI_libguestfs-man-pages-ja = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/libguestfs-man-pages-ja-1.54.0-5.el10.alma.1.noarch.rpm;unpack=0"
SRC_URI += "${URI_libguestfs-man-pages-ja}"
RDEPENDS:libguestfs-man-pages-ja = " \
 libguestfs \
"

URI_libguestfs-man-pages-uk = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/libguestfs-man-pages-uk-1.54.0-5.el10.alma.1.noarch.rpm;unpack=0"
SRC_URI += "${URI_libguestfs-man-pages-uk}"
RDEPENDS:libguestfs-man-pages-uk = " \
 libguestfs \
"

URI_ocaml-libguestfs = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/ocaml-libguestfs-1.54.0-5.el10.alma.1.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_ocaml-libguestfs}"
RDEPENDS:ocaml-libguestfs = " \
 glibc \
 ocaml-runtime \
 libguestfs \
"

URI_ocaml-libguestfs-devel = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/ocaml-libguestfs-devel-1.54.0-5.el10.alma.1.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_ocaml-libguestfs-devel}"
RDEPENDS:ocaml-libguestfs-devel = " \
 ocaml-runtime \
 ocaml \
 ocaml-libguestfs \
"
