
PN = "mutter"
PE = "0"
PV = "47.5"
PR = "8.el10_0"
PACKAGES = "mutter mutter-common mutter-devel mutter-tests"


URI_mutter = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/mutter-47.5-8.el10_0.x86_64_v2.rpm;unpack=0"
RDEPENDS:mutter = "
 lcms2
 systemd-libs
 libICE
 pango
 libSM
 libX11
 libcanberra
 mutter-common
 libX11-xcb
 libXau
 dbus
 libXcomposite
 libXcursor
 libXdamage
 libdisplay-info
 libdrm
 libXext
 libXfixes
 libXi
 libXinerama
 gnome-control-center-filesystem
 libeis
 fribidi
 gnome-desktop4
 libXrandr
 cairo
 libXtst
 gnome-settings-daemon
 atk
 libwacom
 libglvnd-egl
 libglvnd-gles
 libglvnd-glx
 libwayland-server
 libgcc
 gdk-pixbuf2
 libgudev
 libxcb
 pipewire
 mesa-libgbm
 graphene
 libxkbcommon
 pipewire-libs
 libxkbcommon-x11
 libxkbfile
 pixman
 startup-notification
 gsettings-desktop-schemas
 harfbuzz
 libinput
 glib2
 colord-libs
 glibc
 gtk4
"

URI_mutter-common = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/mutter-common-47.5-8.el10_0.noarch.rpm;unpack=0"
RDEPENDS:mutter-common = ""

URI_mutter-devel = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/mutter-devel-47.5-8.el10_0.x86_64_v2.rpm;unpack=0"
RDEPENDS:mutter-devel = "
 glib2-devel
 mutter
 pango-devel
 libX11-devel
 harfbuzz-devel
 libXext
 libXfixes-devel
 libXi-devel
 cairo
 cairo-devel
 atk-devel
 libglvnd-devel
 libwayland-client
 libglvnd-gles
 libgcc
 mesa-libEGL-devel
 libxcb
 graphene-devel
 pixman-devel
 wayland-devel
 gsettings-desktop-schemas-devel
 pkgconf-pkg-config
 glib2
 glibc
 mutter-devel
"

URI_mutter-tests = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/mutter-tests-47.5-8.el10_0.x86_64_v2.rpm;unpack=0"
RDEPENDS:mutter-tests = "
 python3
 mutter
 libX11
 libXext
 libei
 libXrandr
 cairo
 atk
 libwayland-client
 libglvnd-gles
 libwayland-cursor
 libwayland-server
 libgcc
 bash
 mesa-libgbm
 pipewire-libs
 glib2
 gtk3
 colord-libs
 glibc
 mutter-devel
"
