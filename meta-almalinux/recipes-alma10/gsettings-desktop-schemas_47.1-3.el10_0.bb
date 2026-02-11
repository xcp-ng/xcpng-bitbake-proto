
PN = "gsettings-desktop-schemas"
PE = "0"
PV = "47.1"
PR = "3.el10_0"
PACKAGES = "gsettings-desktop-schemas gsettings-desktop-schemas-devel"


URI_gsettings-desktop-schemas = "https://vault.almalinux.org/10.0/BaseOS/x86_64_v2/os/Packages/gsettings-desktop-schemas-47.1-3.el10_0.x86_64_v2.rpm;unpack=0"
RDEPENDS:gsettings-desktop-schemas = "
 glib2
"

URI_gsettings-desktop-schemas-devel = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/gsettings-desktop-schemas-devel-47.1-3.el10_0.x86_64_v2.rpm;unpack=0"
RDEPENDS:gsettings-desktop-schemas-devel = "
 gsettings-desktop-schemas
 pkgconf-pkg-config
"
