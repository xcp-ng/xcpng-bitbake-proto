
inherit dnf-bridge

PN = "cockpit-session-recording"
PE = "0"
PV = "17"
PR = "1.el10"
PACKAGES = "cockpit-session-recording"


URI_cockpit-session-recording = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/cockpit-session-recording-17-1.el10.noarch.rpm;unpack=0"
RDEPENDS:cockpit-session-recording = " \
 sssd-proxy \
 cockpit-system \
 tlog \
"
