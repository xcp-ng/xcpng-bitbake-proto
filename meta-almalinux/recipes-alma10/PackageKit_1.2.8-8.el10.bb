
inherit dnf-bridge

PN = "PackageKit"
PE = "0"
PV = "1.2.8"
PR = "8.el10"
PACKAGES = "PackageKit PackageKit-command-not-found PackageKit-glib PackageKit-gstreamer-plugin PackageKit-gtk3-module PackageKit-glib-devel PackageKit-cron"


URI_src = "https://vault.almalinux.org/10.0/AppStream/Source/Packages/PackageKit-1.2.8-8.el10.src.rpm;unpack=0"
SRC_URI += "${URI_src}"

URI_PackageKit = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/PackageKit-1.2.8-8.el10.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_PackageKit}"
RDEPENDS:PackageKit = " \
 python3 \
 systemd \
 systemd-libs \
 shared-mime-info \
 appstream \
 libgcc \
 sqlite-libs \
 polkit-libs \
 bash \
 glib2 \
 glibc \
 PackageKit-glib \
 libdnf \
 rpm-libs \
"

URI_PackageKit-command-not-found = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/PackageKit-command-not-found-1.2.8-8.el10.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_PackageKit-command-not-found}"
RDEPENDS:PackageKit-command-not-found = " \
 libgcc \
 bash \
 glib2 \
 PackageKit \
 glibc \
 PackageKit-glib \
"

URI_PackageKit-glib = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/PackageKit-glib-1.2.8-8.el10.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_PackageKit-glib}"
RDEPENDS:PackageKit-glib = " \
 gobject-introspection \
 libgcc \
 glib2 \
 dbus \
 glibc \
"

URI_PackageKit-gstreamer-plugin = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/PackageKit-gstreamer-plugin-1.2.8-8.el10.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_PackageKit-gstreamer-plugin}"
RDEPENDS:PackageKit-gstreamer-plugin = " \
 gstreamer1 \
 libgcc \
 glib2 \
 glibc \
 PackageKit-glib \
"

URI_PackageKit-gtk3-module = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/PackageKit-gtk3-module-1.2.8-8.el10.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_PackageKit-gtk3-module}"
RDEPENDS:PackageKit-gtk3-module = " \
 libgcc \
 fontconfig \
 pango \
 glib2 \
 glibc \
 PackageKit-glib \
"

URI_PackageKit-glib-devel = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/PackageKit-glib-devel-1.2.8-8.el10.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_PackageKit-glib-devel}"
RDEPENDS:PackageKit-glib-devel = " \
 glib2-devel \
 pkgconf-pkg-config \
 dbus-devel \
 PackageKit-glib \
 sqlite-devel \
"

URI_PackageKit-cron = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/PackageKit-cron-1.2.8-8.el10.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_PackageKit-cron}"
RDEPENDS:PackageKit-cron = " \
 crontabs \
 bash \
 PackageKit \
"
