
inherit dnf-bridge

PN = "brltty"
PE = "0"
PV = "6.6"
PR = "16.el10"
PACKAGES = "brlapi brltty brltty-at-spi2 brltty-docs brltty-dracut brltty-espeak-ng brltty-xw python3-brlapi brlapi-devel ocaml-brlapi brlapi-java brltty-minimal tcl-brlapi"


URI_brlapi = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/brlapi-0.8.5-16.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:brlapi = " \
 glibc-common \
 libXfixes \
 shadow-utils \
 lua-libs \
 util-linux \
 libX11 \
 libicu \
 bash \
 libXtst \
 glibc \
 coreutils \
"

URI_brltty = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/brltty-6.6-16.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:brltty = " \
 python3 \
 alsa-lib \
 shadow-utils \
 systemd \
 brlapi \
 libicu \
 polkit-libs \
 bash \
 glib2 \
 pcre2-utf32 \
 glibc \
 coreutils \
 bluez-libs \
 dbus-libs \
"

URI_brltty-at-spi2 = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/brltty-at-spi2-6.6-16.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:brltty-at-spi2 = " \
 libXfixes \
 libX11 \
 glibc \
 brltty \
 dbus-libs \
 at-spi2-core \
"

URI_brltty-docs = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/brltty-docs-6.6-16.el10.noarch.rpm;unpack=0"
RDEPENDS:brltty-docs = " \
 brltty \
"

URI_brltty-dracut = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/brltty-dracut-6.6-16.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:brltty-dracut = " \
 brltty \
 bash \
 dracut \
"

URI_brltty-espeak-ng = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/brltty-espeak-ng-6.6-16.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:brltty-espeak-ng = " \
 glibc \
 espeak-ng \
 brltty \
"

URI_brltty-xw = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/brltty-xw-6.6-16.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:brltty-xw = " \
 libX11 \
 xorg-x11-fonts-misc \
 libXt \
 libXaw \
 glibc \
 brltty \
"

URI_python3-brlapi = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/python3-brlapi-0.8.5-16.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:python3-brlapi = " \
 glibc \
 brlapi \
 python3 \
"

URI_brlapi-devel = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/brlapi-devel-0.8.5-16.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:brlapi-devel = " \
 brlapi \
 pkgconf-pkg-config \
"

URI_ocaml-brlapi = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/ocaml-brlapi-0.8.5-16.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:ocaml-brlapi = " \
 glibc \
 ocaml-runtime \
 brlapi \
 ocaml \
"

URI_brlapi-java = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/brlapi-java-0.8.5-16.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:brlapi-java = " \
 glibc \
 brlapi \
"

URI_brltty-minimal = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/brltty-minimal-6.6-16.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:brltty-minimal = " \
 python3 \
 pcre2-utf32 \
 glibc \
 bluez-libs \
 dbus-libs \
"

URI_tcl-brlapi = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/tcl-brlapi-0.8.5-16.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:tcl-brlapi = " \
 glibc \
 brlapi \
 tcl \
"
