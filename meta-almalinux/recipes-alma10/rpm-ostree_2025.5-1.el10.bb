
PN = "rpm-ostree"
PE = "0"
PV = "2025.5"
PR = "1.el10"
PACKAGES = "rpm-ostree rpm-ostree-libs rpm-ostree-devel"


URI_rpm-ostree = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/rpm-ostree-2025.5-1.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:rpm-ostree = " \
 ostree-libs \
 systemd-libs \
 bootc \
 librepo \
 libsolv \
 libarchive \
 json-c \
 json-glib \
 libcap \
 skopeo \
 libstdc++ \
 zlib-ng-compat \
 libgcc \
 openssl-libs \
 libzstd \
 sqlite-libs \
 bash \
 rpm-ostree-libs \
 bubblewrap \
 fuse3 \
 libmodulemd \
 polkit-libs \
 glib2 \
 glibc \
 ostree \
 rpm-libs \
"

URI_rpm-ostree-libs = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/rpm-ostree-libs-2025.5-1.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:rpm-ostree-libs = " \
 ostree-libs \
 libgcc \
 json-glib \
 popt \
 glib2 \
 glibc \
 rpm-libs \
"

URI_rpm-ostree-devel = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/rpm-ostree-devel-2025.5-1.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:rpm-ostree-devel = " \
 ostree-devel \
 pkgconf-pkg-config \
 rpm-ostree-libs \
"
