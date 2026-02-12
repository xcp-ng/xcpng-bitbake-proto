
inherit dnf-bridge

PN = "setroubleshoot-plugins"
PE = "0"
PV = "3.3.14"
PR = "11.el10"
PACKAGES = "setroubleshoot-plugins"


URI_src = "https://vault.almalinux.org/10.0/AppStream/Source/Packages/setroubleshoot-plugins-3.3.14-11.el10.src.rpm;unpack=0"
SRC_URI += "${URI_src}"

URI_setroubleshoot-plugins = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/setroubleshoot-plugins-3.3.14-11.el10.noarch.rpm;unpack=0"
SRC_URI += "${URI_setroubleshoot-plugins}"
RDEPENDS:setroubleshoot-plugins = " \
 setroubleshoot-server \
"
