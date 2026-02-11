
PN = "console-login-helper-messages"
PE = "0"
PV = "0.21.3"
PR = "10.el10"
PACKAGES = "console-login-helper-messages console-login-helper-messages-issuegen console-login-helper-messages-motdgen console-login-helper-messages-profile"


URI_console-login-helper-messages = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/console-login-helper-messages-0.21.3-10.el10.noarch.rpm;unpack=0"
RDEPENDS:console-login-helper-messages = " \
 systemd \
 bash \
"

URI_console-login-helper-messages-issuegen = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/console-login-helper-messages-issuegen-0.21.3-10.el10.noarch.rpm;unpack=0"
RDEPENDS:console-login-helper-messages-issuegen = " \
 setup \
 systemd \
 NetworkManager \
 util-linux \
 bash \
 almalinux-release \
 console-login-helper-messages \
"

URI_console-login-helper-messages-motdgen = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/console-login-helper-messages-motdgen-0.21.3-10.el10.noarch.rpm;unpack=0"
RDEPENDS:console-login-helper-messages-motdgen = " \
 setup \
 systemd \
 util-linux \
 pam \
 bash \
 selinux-policy \
 console-login-helper-messages \
"

URI_console-login-helper-messages-profile = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/console-login-helper-messages-profile-0.21.3-10.el10.noarch.rpm;unpack=0"
RDEPENDS:console-login-helper-messages-profile = " \
 console-login-helper-messages \
 setup \
 systemd \
 bash \
"
