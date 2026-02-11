
PN = "at-spi2-core"
PE = "0"
PV = "2.52.0"
PR = "3.el10"
PACKAGES = "at-spi2-atk at-spi2-atk-devel at-spi2-core at-spi2-core-devel atk atk-devel"


URI_at-spi2-atk = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/at-spi2-atk-2.52.0-3.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:at-spi2-atk = " \
 atk \
 glib2 \
 glibc \
 dbus-libs \
 at-spi2-core \
"

URI_at-spi2-atk-devel = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/at-spi2-atk-devel-2.52.0-3.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:at-spi2-atk-devel = " \
 at-spi2-core-devel \
 atk-devel \
 glib2-devel \
 pkgconf-pkg-config \
 dbus-devel \
 at-spi2-atk \
"

URI_at-spi2-core = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/at-spi2-core-2.52.0-3.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:at-spi2-core = " \
 systemd-libs \
 libXi \
 libX11 \
 xprop \
 bash \
 glib2 \
 dbus \
 libXtst \
 glibc \
 dbus-libs \
"

URI_at-spi2-core-devel = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/at-spi2-core-devel-2.52.0-3.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:at-spi2-core-devel = " \
 glib2-devel \
 libXi-devel \
 pkgconf-pkg-config \
 libX11-devel \
 dbus-devel \
 libXtst-devel \
 at-spi2-core \
"

URI_atk = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/atk-2.52.0-3.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:atk = " \
 glibc \
 glib2 \
 at-spi2-core \
"

URI_atk-devel = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/atk-devel-2.52.0-3.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:atk-devel = " \
 atk \
 glib2-devel \
 pkgconf-pkg-config \
"
