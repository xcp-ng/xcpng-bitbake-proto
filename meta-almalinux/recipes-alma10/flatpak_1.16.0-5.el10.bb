
inherit dnf-bridge

PN = "flatpak"
PE = "0"
PV = "1.16.0"
PR = "5.el10"
PACKAGES = "flatpak flatpak-libs flatpak-selinux flatpak-session-helper flatpak-devel flatpak-tests"


URI_src = "https://vault.almalinux.org/10.0/AppStream/Source/Packages/flatpak-1.16.0-5.el10.src.rpm;unpack=0"
SRC_URI += "${URI_src}"

URI_flatpak = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/flatpak-1.16.0-5.el10.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_flatpak}"
RDEPENDS:flatpak = " \
 python3 \
 ostree-libs \
 xdg-dbus-proxy \
 flatpak-session-helper \
 flatpak-selinux \
 systemd-libs \
 appstream \
 libXau \
 libseccomp \
 libarchive \
 json-glib \
 dconf \
 libcurl \
 shadow-utils \
 libwayland-client \
 librsvg2 \
 libgcc \
 libxml2 \
 gdk-pixbuf2 \
 libzstd \
 bash \
 bubblewrap \
 fuse3 \
 fuse3-libs \
 polkit-libs \
 glib2 \
 glibc \
"

URI_flatpak-libs = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/flatpak-libs-1.16.0-5.el10.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_flatpak-libs}"
RDEPENDS:flatpak-libs = " \
 ostree-libs \
 bubblewrap \
 systemd-libs \
 libarchive \
 libwayland-client \
 libseccomp \
 libgcc \
 libxml2 \
 json-glib \
 libzstd \
 libXau \
 glib2 \
 dconf \
 libcurl \
 glibc \
"

URI_flatpak-selinux = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/flatpak-selinux-1.16.0-5.el10.noarch.rpm;unpack=0"
SRC_URI += "${URI_flatpak-selinux}"
RDEPENDS:flatpak-selinux = " \
 policycoreutils-python-utils \
 policycoreutils \
 bash \
 selinux-policy \
 libselinux-utils \
"

URI_flatpak-session-helper = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/flatpak-session-helper-1.16.0-5.el10.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_flatpak-session-helper}"
RDEPENDS:flatpak-session-helper = " \
 glibc \
 libgcc \
 systemd \
 glib2 \
"

URI_flatpak-devel = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/flatpak-devel-1.16.0-5.el10.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_flatpak-devel}"
RDEPENDS:flatpak-devel = " \
 json-glib-devel \
 wayland-devel \
 flatpak-libs \
 glib2-devel \
 libarchive-devel \
 gpgme-devel \
 libxml2-devel \
 ostree-devel \
 systemd-devel \
 libzstd-devel \
 polkit-devel \
 pkgconf-pkg-config \
 libseccomp-devel \
 libXau-devel \
 libcurl-devel \
 dconf-devel \
 flatpak \
"

URI_flatpak-tests = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/flatpak-tests-1.16.0-5.el10.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_flatpak-tests}"
RDEPENDS:flatpak-tests = " \
 python3 \
 flatpak-libs \
 ostree-libs \
 flatpak-session-helper \
 appstream \
 libXau \
 libseccomp \
 libarchive \
 json-glib \
 dconf \
 libcurl \
 libwayland-client \
 libgcc \
 bash \
 bubblewrap \
 fuse3-libs \
 glib2 \
 glibc \
 ostree \
 flatpak \
"
