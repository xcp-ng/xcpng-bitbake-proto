
PN = "gtk4"
PE = "0"
PV = "4.16.7"
PR = "1.el10"
PACKAGES = "gtk4 gtk4-devel gtk4-devel-docs gtk4-devel-tools"


URI_gtk4 = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/gtk4-4.16.7-1.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:gtk4 = "
 libpng
 libtracker-sparql
 cups-libs
 pango
 fontconfig
 libX11
 hicolor-icon-theme
 libXcursor
 libXdamage
 libXext
 libXfixes
 libXi
 libXinerama
 libepoxy
 fribidi
 adwaita-icon-theme
 libXrandr
 cairo
 cairo-gobject
 libwayland-client
 libwayland-cursor
 libwayland-egl
 gdk-pixbuf2
 gdk-pixbuf2-modules
 graphene
 libxkbcommon
 vulkan-loader
 gstreamer1
 harfbuzz
 gstreamer1-plugins-bad-free-libs
 gstreamer1-plugins-base
 gtk-update-icon-cache
 glib2
 colord-libs
 glibc
 libjpeg-turbo
 libtiff
"

URI_gtk4-devel = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/gtk4-devel-4.16.7-1.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:gtk4-devel = "
 glib2-devel
 libpng
 libtracker-sparql
 pango
 fontconfig
 libX11
 pango-devel
 libX11-devel
 libXcursor
 libXdamage
 libXext
 libXfixes
 libXi
 libXinerama
 libepoxy
 fribidi
 libXrandr
 cairo
 cairo-devel
 cairo-gobject
 cairo-gobject-devel
 libwayland-client
 libwayland-egl
 gdk-pixbuf2
 gdk-pixbuf2-devel
 graphene
 graphene-devel
 libxkbcommon
 vulkan-loader
 vulkan-loader-devel
 wayland-devel
 harfbuzz
 pkgconf-pkg-config
 glib2
 glibc
 gtk4
 gtk4-devel
 libjpeg-turbo
 libtiff
"

URI_gtk4-devel-docs = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/gtk4-devel-docs-4.16.7-1.el10.noarch.rpm;unpack=0"
RDEPENDS:gtk4-devel-docs = "
 gtk4
"

URI_gtk4-devel-tools = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/gtk4-devel-tools-4.16.7-1.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:gtk4-devel-tools = "
 libepoxy
 harfbuzz
 pango
 gdk-pixbuf2
 cairo
 glib2
 graphene
 glibc
 gtk4
"
