
inherit dnf-bridge

PN = "gvfs"
PE = "0"
PV = "1.54.4"
PR = "2.el10"
PACKAGES = "gvfs gvfs-client gvfs-fuse gvfs-goa gvfs-gphoto2 gvfs-mtp gvfs-smb"


URI_gvfs = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/gvfs-1.54.4-2.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:gvfs = " \
 systemd-libs \
 gvfs-client \
 libudisks2 \
 gcr-libs \
 libgcc \
 libxml2 \
 avahi-glib \
 libgudev \
 libsecret \
 avahi-libs \
 bash \
 libsoup3 \
 gsettings-desktop-schemas \
 polkit \
 polkit-libs \
 wsdd \
 glib2 \
 glibc \
 udisks2 \
"

URI_gvfs-client = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/gvfs-client-1.54.4-2.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:gvfs-client = " \
 glibc \
 libgcc \
 glib2 \
"

URI_gvfs-fuse = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/gvfs-fuse-1.54.4-2.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:gvfs-fuse = " \
 gvfs \
 gvfs-client \
 fuse3 \
 fuse3-libs \
 glib2 \
 glibc \
"

URI_gvfs-goa = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/gvfs-goa-1.54.4-2.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:gvfs-goa = " \
 gvfs \
 gvfs-client \
 bash \
 glib2 \
 gnome-online-accounts \
 glibc \
"

URI_gvfs-gphoto2 = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/gvfs-gphoto2-1.54.4-2.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:gvfs-gphoto2 = " \
 gvfs \
 gvfs-client \
 libgphoto2 \
 libgudev \
 bash \
 glib2 \
 glibc \
"

URI_gvfs-mtp = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/gvfs-mtp-1.54.4-2.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:gvfs-mtp = " \
 gvfs \
 gvfs-client \
 libgudev \
 bash \
 glib2 \
 libmtp \
 glibc \
 libusb1 \
"

URI_gvfs-smb = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/gvfs-smb-1.54.4-2.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:gvfs-smb = " \
 libsmbclient \
 gvfs \
 gvfs-client \
 libgcc \
 bash \
 glib2 \
 glibc \
"
