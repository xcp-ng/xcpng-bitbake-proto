
inherit dnf-bridge

PN = "spice-gtk"
PE = "0"
PV = "0.42"
PR = "3.el10"
PACKAGES = "spice-glib spice-glib-devel spice-gtk spice-gtk-tools spice-gtk3 spice-gtk3-devel spice-gtk3-vala"


URI_spice-glib = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/spice-glib-0.42-3.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:spice-glib = " \
 libcacard \
 cyrus-sasl-lib \
 libacl \
 usbredir \
 json-glib \
 libcap-ng \
 libphodav \
 libusb1 \
 zlib-ng-compat \
 openssl-libs \
 opus \
 pixman \
 libsoup3 \
 gstreamer1 \
 lz4-libs \
 gstreamer1-plugins-base \
 polkit-libs \
 glib2 \
 glibc \
 libjpeg-turbo \
"

URI_spice-glib-devel = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/spice-glib-devel-0.42-3.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:spice-glib-devel = " \
 glib2-devel \
 libcacard-devel \
 libusb1-devel \
 lz4-devel \
 cyrus-sasl-devel \
 usbredir-devel \
 libphodav-devel \
 json-glib-devel \
 zlib-ng-compat-devel \
 spice-glib \
 openssl-devel \
 spice-protocol \
 opus-devel \
 pixman-devel \
 libsoup3-devel \
 gstreamer1-devel \
 pkgconf-pkg-config \
 gstreamer1-plugins-base-devel \
 gobject-introspection-devel \
 libjpeg-turbo-devel \
"

URI_spice-gtk = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/spice-gtk-0.42-3.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:spice-gtk = " \
 spice-glib \
"

URI_spice-gtk-tools = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/spice-gtk-tools-0.42-3.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:spice-gtk-tools = " \
 gstreamer1 \
 libwayland-server \
 spice-glib \
 spice-gtk3 \
 glib2 \
 gtk3 \
 glibc \
"

URI_spice-gtk3 = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/spice-gtk3-0.42-3.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:spice-gtk3 = " \
 libwayland-client \
 gstreamer1 \
 libepoxy \
 libwayland-server \
 spice-glib \
 gstreamer1-plugins-base \
 gdk-pixbuf2 \
 libX11 \
 libphodav \
 cairo \
 glib2 \
 gtk3 \
 glibc \
"

URI_spice-gtk3-devel = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/spice-gtk3-devel-0.42-3.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:spice-gtk3-devel = " \
 glib2-devel \
 libcacard-devel \
 libusb1-devel \
 libX11-devel \
 lz4-devel \
 libepoxy-devel \
 cyrus-sasl-devel \
 usbredir-devel \
 libphodav-devel \
 json-glib-devel \
 zlib-ng-compat-devel \
 spice-glib-devel \
 spice-gtk3 \
 openssl-devel \
 spice-protocol \
 opus-devel \
 pixman-devel \
 wayland-devel \
 libsoup3-devel \
 gstreamer1-devel \
 pkgconf-pkg-config \
 gstreamer1-plugins-base-devel \
 gobject-introspection-devel \
 gtk3-devel \
 libjpeg-turbo-devel \
"

URI_spice-gtk3-vala = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/spice-gtk3-vala-0.42-3.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:spice-gtk3-vala = " \
 spice-gtk3 \
 spice-gtk3-devel \
"
