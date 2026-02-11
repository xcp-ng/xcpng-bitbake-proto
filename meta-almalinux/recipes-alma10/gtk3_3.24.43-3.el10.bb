
PN = "gtk3"
PE = "0"
PV = "3.24.43"
PR = "3.el10"
PACKAGES = "gtk-update-icon-cache gtk3 gtk3-devel gtk3-immodule-xim gtk3-immodules gtk3-devel-docs gtk3-tests"


URI_gtk-update-icon-cache = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/gtk-update-icon-cache-3.24.43-3.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:gtk-update-icon-cache = "
 glibc
 glib2
 gdk-pixbuf2
"

URI_gtk3 = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/gtk3-3.24.43-3.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:gtk3 = "
 libtracker-sparql
 cups-libs
 pango
 fontconfig
 libX11
 libXcomposite
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
 at-spi2-atk
 atk
 libwayland-client
 libwayland-cursor
 libwayland-egl
 gdk-pixbuf2
 gdk-pixbuf2-modules
 bash
 libxkbcommon
 harfbuzz
 gtk-update-icon-cache
 glib2
 colord-libs
 glibc
"

URI_gtk3-devel = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/gtk3-devel-3.24.43-3.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:gtk3-devel = "
 glib2-devel
 pango
 fontconfig-devel
 pango-devel
 libX11-devel
 libXcomposite-devel
 libXcursor-devel
 libXdamage-devel
 libXext-devel
 libXfixes-devel
 libXi-devel
 libXinerama-devel
 libepoxy
 libepoxy-devel
 fribidi-devel
 libXrandr-devel
 cairo
 cairo-devel
 cairo-gobject-devel
 at-spi2-atk-devel
 atk
 atk-devel
 gdk-pixbuf2
 gdk-pixbuf2-devel
 libxkbcommon-devel
 wayland-devel
 harfbuzz
 pkgconf-pkg-config
 glib2
 gtk3
 gtk3-devel
 glibc
"

URI_gtk3-immodule-xim = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/gtk3-immodule-xim-3.24.43-3.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:gtk3-immodule-xim = "
 pango
 libX11
 glib2
 gtk3
 glibc
"

URI_gtk3-immodules = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/gtk3-immodules-3.24.43-3.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:gtk3-immodules = "
 glibc
 gtk3
 glib2
 pango
"

URI_gtk3-devel-docs = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/gtk3-devel-docs-3.24.43-3.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:gtk3-devel-docs = "
 gtk3
"

URI_gtk3-tests = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/gtk3-tests-3.24.43-3.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:gtk3-tests = "
 atk
 pango
 gdk-pixbuf2
 libX11
 bash
 cairo
 glib2
 gtk3
 glibc
"
