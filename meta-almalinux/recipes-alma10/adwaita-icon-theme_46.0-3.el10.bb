
PN = "adwaita-icon-theme"
PE = "0"
PV = "46.0"
PR = "3.el10"
PACKAGES = "adwaita-cursor-theme adwaita-icon-theme adwaita-icon-theme-devel"


URI_adwaita-cursor-theme = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/adwaita-cursor-theme-46.0-3.el10.noarch.rpm;unpack=0"
RDEPENDS:adwaita-cursor-theme = ""

URI_adwaita-icon-theme = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/adwaita-icon-theme-46.0-3.el10.noarch.rpm;unpack=0"
RDEPENDS:adwaita-icon-theme = "
 bash
 adwaita-cursor-theme
"

URI_adwaita-icon-theme-devel = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/adwaita-icon-theme-devel-46.0-3.el10.noarch.rpm;unpack=0"
RDEPENDS:adwaita-icon-theme-devel = "
 adwaita-icon-theme
 pkgconf-pkg-config
"
