
PN = "wireshark"
PE = "1"
PV = "4.4.2"
PR = "3.el10_0"
PACKAGES = "wireshark wireshark-cli wireshark-devel"


URI_wireshark = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/wireshark-4.4.2-3.el10_0.x86_64_v2.rpm;unpack=0"
RDEPENDS:wireshark = " \
 libpcap \
 qt6-qtmultimedia \
 libgcc \
 libnl3 \
 libgcrypt \
 qt6-qtbase \
 speexdsp \
 xdg-utils \
 qt6-qt5compat \
 wireshark-cli \
 libstdc++ \
 qt6-qtbase-gui \
 glib2 \
 glibc \
 hicolor-icon-theme \
"

URI_wireshark-cli = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/wireshark-cli-4.4.2-3.el10_0.x86_64_v2.rpm;unpack=0"
RDEPENDS:wireshark-cli = " \
 libpcap \
 systemd-libs \
 krb5-libs \
 libssh \
 libcap \
 shadow-utils \
 zlib-ng-compat \
 gnutls \
 libgcc \
 libgcrypt \
 libxml2 \
 speexdsp \
 libzstd \
 bash \
 pcre2 \
 libsmi \
 glibc \
 c-ares \
 glib2 \
 libnghttp2 \
 libnl3 \
"

URI_wireshark-devel = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/wireshark-devel-4.4.2-3.el10_0.x86_64_v2.rpm;unpack=0"
RDEPENDS:wireshark-devel = " \
 glib2-devel \
 glibc-devel \
 pkgconf-pkg-config \
 wireshark \
 wireshark-cli \
"
